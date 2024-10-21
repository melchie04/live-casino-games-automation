package utilities.objects;

import java.util.Map;

/* ? *******************************************************************************************************************
? This object class contains all information regarding test results.
? It is mainly used to generate a .json file containing all data for each round in the project.
? THESE ARE THE LIST OF METHODS:
? - public String getModule
? - public int getTestCase
? - public Map<String, String> getRoundResult
? - public Map<String, Double> getExpectedResult
? - public Map<String, Double> getActualResult
? - public Map<String, String> getTableInfo
? - public Map<String, Double> getOtherInfo
? - public void setModule
? - public void setTestCase
? - public void setRoundResult
? - public void setExpectedResult
? - public void setActualResult
? - public void setTableInfo
? - public void setOtherInfo
? **********************************************************************************************************************/

@SuppressWarnings("unused")
public class PayoutResult {

    private int testCase;
    private String module;
    private Map<String, String> roundResult;
    private Map<String, Double> expectedResult;
    private Map<String, Double> actualResult;
    private Map<String, String> tableInfo;
    private Map<String, Double> otherInfo;

    /*********************************************************************************************************************
     ** These methods are meant for getting and setting the variables for each test result to generate a data file.
     *********************************************************************************************************************/

    public String getModule() { return module; }

    public void setModule(String module) { this.module = module; }

    public int getTestCase() { return testCase; }

    public void setTestCase(int testCase) { this.testCase = testCase; }

    public Map<String, String> getRoundResult() { return roundResult; }

    public void setRoundResult(Map<String, String>  roundResult) { this.roundResult = roundResult; }

    public Map<String, Double> getExpectedResult() { return expectedResult; }

    public void setExpectedResult(Map<String, Double> expectedResult) { this.expectedResult = expectedResult; }

    public Map<String, Double> getActualResult() { return actualResult; }

    public void setActualResult(Map<String, Double> actualResult) { this.actualResult = actualResult; }

    public Map<String, String> getTableInfo() { return tableInfo; }

    public void setTableInfo(Map<String, String> tableInfo) { this.tableInfo = tableInfo; }

    public Map<String, Double> getOtherInfo() { return otherInfo; }

    public void setOtherInfo(Map<String, Double> otherInfo) { this.otherInfo = otherInfo; }

}
