package org.sahilo.BehaviouralPatterns.TemplateMethodPattern.Solution;

public class Main {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        csvParser.parse();

        DataParser xmlParser = new XMLParser();
        xmlParser.parse();
    }
}
