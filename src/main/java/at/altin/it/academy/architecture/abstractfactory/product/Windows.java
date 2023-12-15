package at.altin.it.academy.architecture.abstractfactory.product;

/**
 * Concrete Product B1: Windows
 */
public class Windows implements OperatingSystem {
    @Override
    public void install() {
        System.out.println("Installing Windows");
    }
}
