package org.sahilo.BehaviouralPatterns.TemplateMethodPattern.Solution;

abstract class DataParser {

    // Template method defining the steps to parse data
    public final void parse() {
        openFile();
        parseData();
        closeFile();
    }

    protected void openFile() {
        System.out.println("Opening file");
    }

    protected void closeFile() {
        System.out.println("Closing file");
    }

    // Child class must implement this method
    protected abstract void parseData();
}

