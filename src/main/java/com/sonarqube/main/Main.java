package com.sonarqube.main;

import java.sql.Timestamp;

public class Main {

    private static final char DELIMITER = '|';

    @SuppressWarnings({"unused", "PMD.TooManyFields"})
    public static void main(String[] args) {
        System.out.println("args = " + args);

        String a = "Aaa";
        String b = "Bbb";

        if (a == b) {
            System.out.println("Main.main");
        }

    }

}
