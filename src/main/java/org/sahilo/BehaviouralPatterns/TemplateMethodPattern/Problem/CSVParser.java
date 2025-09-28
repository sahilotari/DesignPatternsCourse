package org.sahilo.BehaviouralPatterns.TemplateMethodPattern.Problem;

public class CSVParser {
    public void parse(){
        openFile();
        //CSV Specific parsing logic
        System.out.println("Parsing CSV file");
        closeFile();
    }

    private void closeFile() {
        System.out.println("Closing file");
    }

    private void openFile() {
        System.out.println("Opening file");
    }
}
