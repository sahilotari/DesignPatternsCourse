package org.sahilo.SOLIDPrinciples.LSP.BadCode;

public class Main {
    public static void main(String[] args) {
        File file = new ReadOnlyFile();
        file.read();
        file.write(); // Violation of LSP
    }
}
