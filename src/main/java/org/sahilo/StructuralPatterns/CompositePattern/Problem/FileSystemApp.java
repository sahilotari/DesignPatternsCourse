package org.sahilo.StructuralPatterns.CompositePattern.Problem;

public class FileSystemApp {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);

        root.addFile(file1);
        root.addFile(file2);

        root.showDetails();
    }
}
