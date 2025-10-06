package org.sahilo.StructuralPatterns.CompositePattern.Solution;

public class FileSystemApp {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        FileSystemComponent file1 = new File("file1.txt", 100);
        FileSystemComponent file2 = new File("file2.txt", 200);

        root.addComponent(file1);
        root.addComponent(file2);

        // Subfolder
        Folder subFolder = new Folder("root/subfolder");
        FileSystemComponent file3 = new File("file3.txt", 300);
        subFolder.addComponent(file3);
        root.addComponent(subFolder);

        root.showDetails();
    }
}
