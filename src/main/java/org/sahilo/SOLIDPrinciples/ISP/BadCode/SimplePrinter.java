package org.sahilo.SOLIDPrinciples.ISP.BadCode;

public class SimplePrinter implements Machine{
    @Override
    public void print(Document doc) {
        System.out.println("Printing the document...");
    }

    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("Scan Not supported");
    }

    @Override
    public void copy(Document doc) {
        throw new UnsupportedOperationException("copying not supported");
    }
}
