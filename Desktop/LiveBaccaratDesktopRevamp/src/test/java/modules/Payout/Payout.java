package modules.Payout;

import globals.Methods;
import locators.XPath;
import utilities.features.JsonFeature;
import utilities.features.ScreenshotFeature;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.interfaces.PayoutTestCase;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;
import utilities.objects.PayoutResult;
import utilities.objects.Printer;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Payout extends Methods {

    /*********************************************************************************************************************
     *********************************************** VARIABLES ***********************************************************
     *********************************************************************************************************************/

    public static final String MODULE = "PAYOUT";
    protected static String roundID;
    protected static String tableName;
    protected static double totalWinBet;
    protected static double totalWinResult;
    protected static double totalBet;
    protected static double balanceBeforeBetting;
    protected static double balanceAfterBetting;
    protected static double balanceAfterDealing;
    protected static boolean isPlayerPlaced;
    protected static boolean isBankerPlaced;
    protected static boolean isTiePlaced;
    protected static boolean isDragonBonusPlaced;
    protected static boolean isPairPlaced;
    protected static boolean isFortuneSixPlaced;
    protected static boolean isNonCommission;
    private static String tableInfo;
    private static List<PayoutTestCase> payoutTestCaseList;
    private static List<PayoutTestCase> ignoredPayoutTestCase;

    /*********************************************************************************************************************
     *********************************************** PROCESSES ***********************************************************
     *********************************************************************************************************************/

    public static void init(List<String> roundResults) {
        payoutTestCaseList = new ArrayList<>();
        for (String roundResult : roundResults) {
            switch (roundResult) {
                case "Commission Player" -> payoutTestCaseList.add(new POTest1());
                case "Commission Banker" -> payoutTestCaseList.add(new POTest2());
                case "Commission Tie" -> payoutTestCaseList.add(new POTest3());
                case "Commission Pair" -> payoutTestCaseList.add(new POTest4());
                case "Commission Push" -> payoutTestCaseList.add(new POTest5());
                case "Non-commission Player" -> payoutTestCaseList.add(new POTest6());
                case "Non-commission Banker" -> payoutTestCaseList.add(new POTest7());
                case "Non-commission Tie" -> payoutTestCaseList.add(new POTest9());
                case "Non-commission Push" -> payoutTestCaseList.add(new POTest10());
                case "Non-commission Pair" -> payoutTestCaseList.add(new POTest11());
                case "Dragon Bonus" -> payoutTestCaseList.add(new POTest12To19());
                case "Fortune Six" -> payoutTestCaseList.add(new POTest20To21());
            }
        }
    }

    public static boolean isCompleted() {
        return payoutTestCaseList.isEmpty();
    }

    public static void setBeforeBetting() {
        if (payoutTestCaseList.isEmpty()) return;

        ignoredPayoutTestCase = new ArrayList<>();
        isPlayerPlaced = false;
        isBankerPlaced = false;
        isTiePlaced = false;
        isPairPlaced = false;
        isDragonBonusPlaced = false;
        isFortuneSixPlaced = false;
        balanceBeforeBetting = 0.0;
        balanceAfterBetting = 0.0;
        balanceAfterDealing = 0.0;
        totalWinBet = 0.0;
        totalWinResult = 0.0;
        totalBet = 0.0;
        roundID = GetHandler.getText(XPath.GameTable.NavBar.RoundID);
        tableName = getTableName();
        tableInfo = "Round ID " + roundID + " of the " + tableName;
        System.out.println("    " + tableInfo);
        balanceBeforeBetting = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
        System.out.println("    Balance Before Betting: " + balanceBeforeBetting);
    }

    public static void setBettingOption() {
        if (payoutTestCaseList.isEmpty()) return;

        processPayoutTestCases(PayoutTestCase::placeBettingOption);
        EventHandler.click(XPath.GameTable.ToolBar.Confirm, 3);
    }

    public static void setAfterBetting() {
        if (payoutTestCaseList.isEmpty()) return;

        processPayoutTestCases(PayoutTestCase::checkBettingChip);
        totalBet = GetHandler.getDouble(XPath.GameTable.NavBar.TotalBet);
        balanceAfterBetting = GetHandler.getDouble(XPath.GameTable.NavBar.Balance);
        System.out.println("    Balance After Betting: " + balanceAfterBetting);
        ScreenshotFeature.capture("bet", tableInfo);
    }

    public static void setDealingResult(String[] roundResult) {
        if (payoutTestCaseList.isEmpty()) return;

        balanceAfterDealing = getUpdatedBalance();
        System.out.println("    Balance After Dealing: " + balanceAfterDealing);
        ScreenshotFeature.capture("balance", (tableInfo + " " + Helper.toString(roundResult)));
        processPayoutTestCases(payoutTestCase -> payoutTestCase.computeWinResult(roundResult));
        System.out.println("    Total Win Bet: " + totalWinBet);
        System.out.println("    Total Win Result: " + totalWinResult);
        processPayoutTestCases(payoutTestCase -> payoutTestCase.saveTestCase(roundResult, payoutTestCaseList));

        if (!payoutTestCaseList.isEmpty()) {
            System.out.println("    Payout Test Cases Left: " + Helper.toString(getTestCaseList(payoutTestCaseList)));
            if (!ignoredPayoutTestCase.isEmpty())
                System.out.println("    Ignored Result And Statistics Test Cases: " + Helper.toString(getTestCaseList(ignoredPayoutTestCase)));
        }
    }

    private static int[] getTestCaseList(List<PayoutTestCase> payoutTestCaseList) {
        Set<Integer> uniqueTestCases = payoutTestCaseList.stream().map(PayoutTestCase::getTestCase)
                .filter(testCase -> testCase != 0).collect(Collectors.toSet());
        return uniqueTestCases.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void processPayoutTestCases(Consumer<PayoutTestCase> action) {
        for (PayoutTestCase payoutTestCase : new ArrayList<>(payoutTestCaseList)) {
            try {
                if (!ignoredPayoutTestCase.contains(payoutTestCase)) action.accept(payoutTestCase);
            } catch (Exception e) {
                ignoredPayoutTestCase.add(payoutTestCase);
                Printer.printError("Test Case " + payoutTestCase.getTestCase() + ": " + e.getMessage());
            }
        }
    }

    /*********************************************************************************************************************
     *********************************************** COMPUTATION *********************************************************
     *********************************************************************************************************************/

    protected static void addWin(double chipValue, double payoutOdds) {
        totalWinBet += chipValue;
        totalWinResult += (chipValue * payoutOdds);
    }

    /*********************************************************************************************************************
     *********************************************** VERIFICATION ********************************************************
     *********************************************************************************************************************/

    protected static Map<String, String> getTableInfoMap() {
        Map<String, String> tableInfo = new HashMap<>();
        tableInfo.put("roundID", roundID);
        tableInfo.put("tableName", tableName);
        return tableInfo;
    }

    protected static Map<String, String> getRoundResultMap(String[] roundResult) {
        Map<String, String> roundResults = new HashMap<>();
        roundResults.put("player", roundResult[0]);
        roundResults.put("banker", roundResult[1]);
        List<String> results = new ArrayList<>(Arrays.asList(roundResult));
        results.remove(roundResult[0]);
        results.remove(roundResult[1]);
        roundResults.put("results", Helper.toString(results));
        return roundResults;
    }

    protected static Map<String, Double> getExpectedResultMap() {
        double expectedTotalPayout = totalWinBet + totalWinResult;
        double expectedTotalWinLose = expectedTotalPayout - totalBet;
        double expectedTotalBalance = balanceAfterBetting + expectedTotalPayout;
        Map<String, Double> expectedResults = new HashMap<>();
        expectedResults.put("expectedTotalBalance", expectedTotalBalance);
        expectedResults.put("expectedTotalPayout", expectedTotalPayout);
        expectedResults.put("expectedTotalWinLose", expectedTotalWinLose);
        return expectedResults;
    }

    protected static Map<String, Double> getActualResultMap() {
        double actualTotalBalance = balanceAfterDealing;
        double actualTotalPayout = balanceAfterDealing - balanceAfterBetting;
        double actualTotalWinLose = actualTotalPayout - totalBet;
        Map<String, Double> actualResults = new HashMap<>();
        actualResults.put("actualTotalBalance", actualTotalBalance);
        actualResults.put("actualTotalPayout", actualTotalPayout);
        actualResults.put("actualTotalWinLose", actualTotalWinLose);
        return actualResults;
    }

    protected static Map<String, Double> getOtherInfoMap(double bet, double payoutOdds, double payout) {
        Map<String, Double> otherInfo = new HashMap<>();
        otherInfo.put("balanceBeforeBetting", balanceBeforeBetting);
        otherInfo.put("balanceAfterBetting", balanceAfterBetting);
        otherInfo.put("balanceAfterDealing", balanceAfterDealing);
        otherInfo.put("payoutOdds", payoutOdds);
        otherInfo.put("bet", bet);
        otherInfo.put("payout", payout);
        otherInfo.put("totalBet", totalBet);
        return otherInfo;
    }

    public static void verify(int testCase, String name) {
        PayoutResult result = JsonFeature.read(name, MODULE, testCase);

        Map<String, String> roundResult = result.getRoundResult();
        Map<String, Double> expectedResult = result.getExpectedResult();
        Map<String, Double> actualResult = result.getActualResult();
        Map<String, String> tableInfo = result.getTableInfo();
        Map<String, Double> otherInfo = result.getOtherInfo();

        double expectedTotalBalance = expectedResult.get("expectedTotalBalance");
        double expectedTotalPayout = expectedResult.get("expectedTotalPayout");
        double expectedTotalWinLose = expectedResult.get("expectedTotalWinLose");
        double actualTotalBalance = actualResult.get("actualTotalBalance");
        double actualTotalPayout = actualResult.get("actualTotalPayout");
        double actualTotalWinLose = actualResult.get("actualTotalWinLose");

        System.out.println();
        System.out.println("Module: PAYOUT");
        System.out.println("Test Case: " + testCase);
        System.out.println("Table Information: " + "Round ID " + tableInfo.get("roundID") + " of the " + tableInfo.get("tableName"));
        System.out.println("Round Result: " + roundResult.get("player") + " " + roundResult.get("banker") + " " + roundResult.get("results"));
        System.out.println("Bet: " + otherInfo.get("bet"));
        System.out.println("Payout Odds: " + otherInfo.get("payoutOdds"));
        System.out.println("Payout: " + otherInfo.get("payout"));
        System.out.println("Total Bet: " + otherInfo.get("totalBet"));
        System.out.println("Balance Before Betting: " + otherInfo.get("balanceBeforeBetting"));
        System.out.println("Balance After Betting: " + otherInfo.get("balanceAfterBetting"));
        System.out.println("Balance After Dealing: " + otherInfo.get("balanceAfterDealing"));

        CustomAssert.assertEquals(
                "PO Test " + testCase,
                expectedTotalBalance,
                actualTotalBalance,
                "Actual Total Balance: " + actualTotalBalance + " == Expected Total Balance: " + expectedTotalBalance,
                "Actual Total Balance: " + actualTotalBalance + " != Expected Total Balance: " + expectedTotalBalance
        );

        CustomAssert.assertEquals(
                "PO Test " + testCase,
                expectedTotalPayout,
                actualTotalPayout,
                "Actual Total Payout: " + actualTotalPayout + " == Expected Total Payout: " + expectedTotalPayout,
                "Actual Total Payout: " + actualTotalPayout + " != Expected Total Payout: " + expectedTotalPayout
        );

        CustomAssert.assertEquals(
                "PO Test " + testCase,
                expectedTotalWinLose,
                actualTotalWinLose,
                "Actual Total Win/Lose: " + actualTotalWinLose + " == Expected Total Win/Lose: " + expectedTotalWinLose,
                "Actual Total Win/Lose: " + actualTotalWinLose + " != Expected Total Win/Lose: " + expectedTotalWinLose
        );

        System.out.println();
    }

}
