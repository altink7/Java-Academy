package at.altin.it.academy.architecture.abstractfactory.product;

/**
 * Concrete Product A2: Desktop
 */
public class Desktop implements Computer {
    @Override
    public void use() {
        System.out.println("Using Desktop");
    }
}
