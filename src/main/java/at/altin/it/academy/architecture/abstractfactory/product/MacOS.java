package at.altin.it.academy.architecture.abstractfactory.product;

/**
 * Concrete Product B2: MacOS
 */
public class MacOS implements OperatingSystem {
    @Override
    public void install() {
        System.out.println("Installing MacOS");
    }
}
