package com.sonarqube.main;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final char DELIMITER = '|';
    private static final Pattern CLIENT_ID_PATTERN = Pattern.compile("[#\\$%\\*\\./]");
    private static final String UNDERLINE = "_";


    @SuppressWarnings({"unused", "PMD.TooManyFields"})
    public static void main(String[] args) {
        System.out.println("args = " + args);

        String a = "Aaa";
        String b = "Bbb";

        if (a == b) {
            System.out.println("Main.main");
        }

        String clientIdInit = "abc#def$xyz";

        final String clientId = clientIdInit.replaceAll("[#\\$%\\*\\./]", "_");
        System.out.println("clientId = " + clientId);

        Matcher matcher = CLIENT_ID_PATTERN.matcher(clientIdInit);
        String clientId2 = matcher.replaceAll(UNDERLINE);
        System.out.println("clientId2 = " + clientId2);
    }

}
