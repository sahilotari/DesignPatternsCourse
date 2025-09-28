package org.sahilo.BehaviouralPatterns.TemplateMethodPattern.Problem;

public class XMLParser {
    public void parse(){
        openFile();
        //XML Specific parsing logic
        System.out.println("Parsing XML file");
        closeFile();
    }

    private void closeFile() {
        System.out.println("Closing file");
    }

    private void openFile() {
        System.out.println("Opening file");
    }
}
