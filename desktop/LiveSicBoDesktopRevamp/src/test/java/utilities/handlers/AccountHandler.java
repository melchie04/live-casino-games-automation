package utilities.handlers;

import io.github.cdimascio.dotenv.Dotenv;

/* ? *******************************************************************************************************************
? THESE ARE THE LIST OF METHODS:
? - public String getUrl
? - public String getUsername
? - public String getPassword
? **********************************************************************************************************************/

@SuppressWarnings("unused")
public class AccountHandler {

    private static final String URL; // The URL of the website.
    private static final String USERNAME; // The username of the website.
    private static final String PASSWORD; // The password of the website.

    static {
        URL = getEnvVariable("SBOBET_URL");
        USERNAME = getEnvVariable("SBOBET_USERNAME");
        PASSWORD = getEnvVariable("SBOBET_PASSWORD");
    }

    private static String getEnvVariable(String key) {
        return System.getenv(key) != null ? System.getenv(key) : Dotenv.load().get(key);
    }

    public static String getUrl() {
        return URL;
    }

    public static String getUsername() {
        return USERNAME;
    }

    public static String getPassword() {
        return PASSWORD;
    }

}