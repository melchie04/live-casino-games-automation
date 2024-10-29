package utilities.features;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.SkipException;
import utilities.handlers.DirectoryHandler;
import utilities.objects.PayoutResult;
import utilities.objects.Printer;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

/* ? *******************************************************************************************************************
? THESE ARE THE LIST OF METHODS:
? - public static void clean
? - public static void write
? - public static PayoutResult read
? **********************************************************************************************************************/

@SuppressWarnings("unused")
public class JsonFeature {

    private static final String FORMAT = ".json";

    /*********************************************************************************************************************
     ** The 'clean' method is used to clear the json file before generating a new set of data.
     *********************************************************************************************************************/

    public static void clean(String module) {
        String path = DirectoryHandler.getGeneratedPath() + File.separator + module.toLowerCase() + FORMAT;
        if (new File(path).exists()) DirectoryHandler.deleteDirectory(path);
    }

    /*********************************************************************************************************************
     ** The 'write' method is used to write each set of data in the json file.
     *********************************************************************************************************************/

    public static void write(String module,
                             int testCase,
                             Map<String, String> roundResult,
                             Map<String, Double> expectedResult,
                             Map<String, Double> actualResult,
                             Map<String, String> tableInfo,
                             Map<String, Double> otherInfo) {
        try {

            DirectoryHandler.createDirectory(DirectoryHandler.getGeneratedPath());
            String path = DirectoryHandler.getGeneratedPath() + File.separator + module.toLowerCase() + FORMAT;

            PayoutResult result = new PayoutResult();
            result.setModule(module);
            result.setTestCase(testCase);
            result.setRoundResult(roundResult);
            result.setExpectedResult(expectedResult);
            result.setActualResult(actualResult);
            result.setTableInfo(tableInfo);
            result.setOtherInfo(otherInfo);

            File file = new File(path);
            ObjectMapper objectMapper = new ObjectMapper();
            List<PayoutResult> payoutResultList = new ArrayList<>();

            if (file.exists()) {
                PayoutResult[] existingResults = objectMapper.readValue(file, PayoutResult[].class);
                payoutResultList = new ArrayList<>(Arrays.asList(existingResults));
            }

            payoutResultList.add(result);
            objectMapper.writeValue(file, payoutResultList.stream().
                    sorted(Comparator.comparing(PayoutResult::getModule)
                            .thenComparing(PayoutResult::getTestCase)).collect(Collectors.toList()));
        } catch (Exception e) {
            String message = "Failed to set test result for test case " + testCase + " of " + module;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

    /*********************************************************************************************************************
     ** The 'read' method is used to read each set of data in the json file.
     *********************************************************************************************************************/


    public static PayoutResult read(String name, String module, int testCase) {
        try {

            String path = DirectoryHandler.getGeneratedPath() + File.separator + module.toLowerCase() + FORMAT;
            File file = new File(path);
            ObjectMapper objectMapper = new ObjectMapper();

            PayoutResult[] existingResults = objectMapper.readValue(file, PayoutResult[].class);
            List<PayoutResult> payoutResultList = new ArrayList<>(Arrays.asList(existingResults));

            Optional<PayoutResult> resultOptional = payoutResultList.stream()
                    .filter(result -> Objects.equals(result.getModule(), module))
                    .filter(result -> result.getTestCase() == testCase).findFirst();
            return resultOptional.orElseThrow();

        } catch (NoSuchElementException e) {
            String message = "No data found for " + name + " of " + module;
            Printer.printError(message);
            throw new SkipException(message, e);
        } catch (Exception e) {
            String message = "Failed to get test result for test case " + testCase + " of " + module;
            Printer.printError(message);
            throw new RuntimeException(message, e);
        }
    }

}