package org.sahilo.SOLIDPrinciples.ISP.GoodCode;

import org.sahilo.SOLIDPrinciples.ISP.BadCode.Document;

public class MultiPurposeMachine implements Printer, Scanner, Copier{
    @Override
    public void print(Document doc) {
        System.out.println("Printing document...");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning document...");
    }

    @Override
    public void copy(Document doc) {
        System.out.println("Copying document...");
    }
}