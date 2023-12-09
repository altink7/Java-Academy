package at.altin.it.academy.architecture.abstractfactory.product;

/**
 * Concrete Product A1: Laptop
 */
public class Laptop implements Computer {
    @Override
    public void use() {
        System.out.println("Using Laptop");
    }
}
