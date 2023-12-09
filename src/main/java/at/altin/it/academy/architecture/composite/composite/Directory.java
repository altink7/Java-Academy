package at.altin.it.academy.architecture.composite.composite;

import at.altin.it.academy.architecture.composite.component.FileSystemComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite
 */
public class Directory implements FileSystemComponent {
    private final String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void displayInfo() {
        System.out.println("Directory: " + name);
        System.out.println("Contents of " + name + ":");
        for (FileSystemComponent component : components) {
            component.displayInfo();
        }
    }
}
