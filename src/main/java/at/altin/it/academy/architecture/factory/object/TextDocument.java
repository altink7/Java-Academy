package at.altin.it.academy.architecture.factory.object;

/**
 * Factory object (Concrete Text Document)
 */
public class TextDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Text Document");
    }

    @Override
    public void save() {
        System.out.println("Saving Text Document");
    }
}