package org.sahilo.BehaviouralPatterns.TemplateMethodPattern.Solution;

public class JSONParser extends DataParser{
    @Override
    protected void parseData() {
        System.out.println("Parsing JSON file");
    }
}
