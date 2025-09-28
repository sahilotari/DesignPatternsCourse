package org.sahilo.BehaviouralPatterns.TemplateMethodPattern.Problem;

public class JSONParser {
    public void parse(){
        openFile();
        //JSON Specific parsing logic
        System.out.println("Parsing JSON file");
        closeFile();
    }

    private void closeFile() {
        System.out.println("Closing file");
    }

    private void openFile() {
        System.out.println("Opening file");
    }
}
