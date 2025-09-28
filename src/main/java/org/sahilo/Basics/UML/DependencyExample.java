package org.sahilo.Basics.UML;

import java.util.Optional;

class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class Printer {
    public void print(Document doc) {
        System.out.println("Printing document: "+ doc.getContent());
    }
}

public class DependencyExample {
    public static void main(String[] args) {
        Document doc = new Document("Dependency Example");
        Printer printer = new Printer();

        // Printer depends on Document to print its content
        printer.print(doc);
    }
}
