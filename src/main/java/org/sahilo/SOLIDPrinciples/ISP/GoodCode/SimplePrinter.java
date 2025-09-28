package org.sahilo.SOLIDPrinciples.ISP.GoodCode;

import org.sahilo.SOLIDPrinciples.ISP.BadCode.Document;

public class SimplePrinter implements Printer{
    @Override
    public void print(Document doc) {
        System.out.println("Printing the file");
    }
}
