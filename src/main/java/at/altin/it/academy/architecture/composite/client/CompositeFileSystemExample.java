package at.altin.it.academy.architecture.composite.client;

import at.altin.it.academy.architecture.composite.component.FileSystemComponent;
import at.altin.it.academy.architecture.composite.composite.Directory;
import at.altin.it.academy.architecture.composite.leaf.File;

/**
 * Client code that uses the composite pattern
 */
public class CompositeFileSystemExample {
    public static void main(String[] args) {
        // Create files
        FileSystemComponent file1 = new File("Document.txt");
        FileSystemComponent file2 = new File("Image.jpg");

        // Create a directory and add files to it
        Directory documentsDirectory = new Directory("Documents");
        documentsDirectory.addComponent(file1);
        documentsDirectory.addComponent(file2);

        // Create more files
        FileSystemComponent file3 = new File("Spreadsheet.xlsx");
        FileSystemComponent file4 = new File("Presentation.pptx");

        // Create another directory and add files to it
        Directory workDirectory = new Directory("Work");
        workDirectory.addComponent(file3);
        workDirectory.addComponent(file4);

        // Create the root directory and add both subdirectories to it
        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(documentsDirectory);
        rootDirectory.addComponent(workDirectory);

        // Show details of the entire file system
        rootDirectory.displayInfo();
    }
}
