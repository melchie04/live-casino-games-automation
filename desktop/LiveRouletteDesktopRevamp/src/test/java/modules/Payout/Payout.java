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
    protected static boolean isRedPlaced;
    protected static boolean isBlackPlaced;
    protected static boolean isEvenPlaced;
    protected static boolean isOddPlaced;
    protected static boolean isLowPlaced;
    protected static boolean isHighPlaced;
    protected static boolean is1stDozenPlaced;
    protected static boolean is2ndDozenPlaced;
    protected static boolean is3rdDozenPlaced;
    protected static boolean is1stColumnPlaced;
    protected static boolean is2ndColumnPlaced;
    protected static boolean is3rdColumnPlaced;
    protected static boolean isStraightUpPlaced;
    protected static boolean isSplitPlaced;
    protected static boolean isStreetPlaced;
    protected static boolean isCornerPlaced;
    protected static boolean isSixLinePlaced;
    protected static boolean isZeroSectionPlaced;
    protected static boolean isZeroCornerPlaced;
    private static String tableInfo;
    private static List<PayoutTestCase> payoutTestCaseList;
    private static List<PayoutTestCase> ignoredPayoutTestCase;

    /*********************************************************************************************************************
     *********************************************** PROCESSES ***********************************************************
     *********************************************************************************************************************/

    public static void init1(List<String> roundResults) {
        payoutTestCaseList = new ArrayList<>();
        for (String roundResult : roundResults) {
            switch (roundResult) {
                case "Red" -> payoutTestCaseList.add(new POTest1());
                case "Black" -> payoutTestCaseList.add(new POTest2());
                case "Even" -> payoutTestCaseList.add(new POTest3());
                case "Odd" -> payoutTestCaseList.add(new POTest4());
                case "Low" -> payoutTestCaseList.add(new POTest5());
                case "High" -> payoutTestCaseList.add(new POTest6());
                case "1st Dozen" -> payoutTestCaseList.add(new POTest7());
                case "2nd Dozen" -> payoutTestCaseList.add(new POTest8());
                case "3rd Dozen" -> payoutTestCaseList.add(new POTest9());
                case "1st Column" -> payoutTestCaseList.add(new POTest10());
                case "2nd Column" -> payoutTestCaseList.add(new POTest11());
                case "3rd Column" -> payoutTestCaseList.add(new POTest12());
                case "Street" -> payoutTestCaseList.add(new POTest15());
                case "Corner" -> payoutTestCaseList.add(new POTest16());
                case "Six Line" -> payoutTestCaseList.add(new POTest17());
                case "Zero Section" -> payoutTestCaseList.add(new POTest18());
                case "Zero Corner" -> payoutTestCaseList.add(new POTest19());
            }
        }
    }

    public static void init2(List<String> roundResults) {
        payoutTestCaseList = new ArrayList<>();
        for (String roundResult : roundResults) {
            switch (roundResult) {
                case "Straight Up" -> payoutTestCaseList.add(new POTest13());
                case "Split" -> payoutTestCaseList.add(new POTest14());
            }
        }
    }

    public static boolean isCompleted() {
        return payoutTestCaseList.isEmpty();
    }

    public static void setBeforeBetting() {
        if (payoutTestCaseList.isEmpty()) return;

        ignoredPayoutTestCase = new ArrayList<>();
        isRedPlaced = false;
        isBlackPlaced = false;
        isEvenPlaced = false;
        isOddPlaced = false;
        isLowPlaced = false;
        isHighPlaced = false;
        is1stDozenPlaced = false;
        is2ndDozenPlaced = false;
        is3rdDozenPlaced = false;
        is1stColumnPlaced = false;
        is2ndColumnPlaced = false;
        is3rdColumnPlaced = false;
        isStraightUpPlaced = false;
        isSplitPlaced = false;
        isStreetPlaced = false;
        isCornerPlaced = false;
        isSixLinePlaced = false;
        isZeroSectionPlaced = false;
        isZeroCornerPlaced = false;
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
        roundResults.put("number", roundResult[0]);
        roundResults.put("color", roundResult[1]);
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
        System.out.println("Round Result: " + roundResult.get("number") + " " + roundResult.get("color"));
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
