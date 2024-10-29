package utilities.handlers;

import utilities.Utilities;

import java.io.File;
import java.io.IOException;

/* ? *******************************************************************************************************************
? THESE ARE THE LIST OF METHODS:
? - public static String getFeaturePath
? - public static String getScreenshotPath
? - public static String getGeneratedPath
? - public static void createDirectory
? - public static void deleteDirectory
? **********************************************************************************************************************/

@SuppressWarnings("unused")
public class DirectoryHandler extends Utilities {

    public static final String RESULTS_PATH = System.getProperty("user.dir") + "\\results";

    /*********************************************************************************************************************
     ** These getter methods is used to retrieve a specific folder within the test directory.
     *********************************************************************************************************************/

    public static String getFeaturePath() { return RESULTS_PATH + "\\" + customScenario.getFeature(); }

    public static String getScreenshotPath() { return RESULTS_PATH + "\\" + customScenario.getFeature() + "\\screenshots"; }

    public static String getGeneratedPath() { return RESULTS_PATH + "\\" + customScenario.getFeature() + "\\generated"; }

    /*********************************************************************************************************************
     ** The 'createDirectory' method is used to create a specific folder within the test directory.
     *********************************************************************************************************************/

    public static void createDirectory(String path) {
        File folder = new File(path);
        if (!folder.exists()) {
            boolean success = folder.mkdirs();
            if (success) System.out.println();
            else System.err.println();
        }
    }

    /*********************************************************************************************************************
     ** The 'deleteDirectory' method is used to delete a specific folder within the test directory.
     *********************************************************************************************************************/

    public static void deleteDirectory(String path) {
        try {
            File folder = new File(path);
            if (folder.isDirectory()) {
                File[] files = folder.listFiles();
                if (files != null) for (File file : files) deleteDirectory(file.getAbsolutePath());
            }
            if (!folder.delete()) throw new IOException("Failed to delete directory: " + folder);
        } catch (IOException e) { /* Ignore IOException */ }
    }


}
