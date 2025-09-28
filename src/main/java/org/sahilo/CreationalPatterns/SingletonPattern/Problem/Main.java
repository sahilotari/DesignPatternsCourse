package org.sahilo.CreationalPatterns.SingletonPattern.Problem;

public class Main {
    public static void main(String[] args) {
        AppSettings appSettings1 = new AppSettings();
        AppSettings appSettings2 = new AppSettings();
        // We should avoid creating copy, if someone also creates another instance, then as well
        // only one instance should be there


        System.out.println(appSettings1.getApiKey());
        System.out.println(appSettings2.getApiKey());

        // Both instances will have different memory addresses
        System.out.println(appSettings1);
        System.out.println(appSettings2);
        System.out.println(appSettings1 == appSettings2); // false
    }
}
