package org.sahilo.BehaviouralPatterns.TemplateMethodPattern.Solution;

public class XMLParser extends DataParser{
    @Override
    protected void parseData() {
        System.out.println("Parsing XML file");
    }
}
