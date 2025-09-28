package org.sahilo.BehaviouralPatterns.TemplateMethodPattern.Solution;

public class CSVParser extends DataParser{
    @Override
    protected void parseData() {
        System.out.println("Parsing CSV file");
    }
}
