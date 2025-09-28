package org.sahilo.CreationalPatterns.SingletonPattern.Solution;

public class Main {
    public static void main(String[] args) {
        AppSettings appSettings1 =  AppSettings.getInstance();
        AppSettings appSettings2 =  AppSettings.getInstance();

        System.out.println(appSettings1 == appSettings2); // true


    }
}
