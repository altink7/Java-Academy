package at.altin.it.academy.architecture.abstractfactory.client;

import at.altin.it.academy.architecture.abstractfactory.factory.ComputerFactory;
import at.altin.it.academy.architecture.abstractfactory.factory.DesktopFactory;
import at.altin.it.academy.architecture.abstractfactory.factory.LaptopFactory;
import at.altin.it.academy.architecture.abstractfactory.product.Computer;
import at.altin.it.academy.architecture.abstractfactory.product.OperatingSystem;

/**
 * Client code using the Abstract Factory pattern
 */
public class AbstractFactorySimulation {
    public static void main(String[] args) {
        // Create a LaptopFactory
        ComputerFactory laptopFactory = new LaptopFactory();
        // Use the factory to create a laptop and install its operating system
        Computer laptop = laptopFactory.createComputer();
        OperatingSystem laptopOS = laptopFactory.installOperatingSystem();

        // Perform operations on the laptop
        laptop.use();
        laptopOS.install();

        // Create a DesktopFactory
        ComputerFactory desktopFactory = new DesktopFactory();
        // Use the factory to create a desktop and install its operating system
        Computer desktop = desktopFactory.createComputer();
        OperatingSystem desktopOS = desktopFactory.installOperatingSystem();

        // Perform operations on the desktop
        desktop.use();
        desktopOS.install();
    }
}
