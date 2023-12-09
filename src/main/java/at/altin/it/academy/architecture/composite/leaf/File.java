package at.altin.it.academy.architecture.composite.leaf;

import at.altin.it.academy.architecture.composite.component.FileSystemComponent;

/**
 * Leaf
 */
public class File implements FileSystemComponent {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void displayInfo() {
        System.out.println("File: " + name);
    }
}
