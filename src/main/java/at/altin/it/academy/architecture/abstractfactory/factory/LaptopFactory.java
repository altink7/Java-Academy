package at.altin.it.academy.architecture.abstractfactory.factory;

import at.altin.it.academy.architecture.abstractfactory.product.Computer;
import at.altin.it.academy.architecture.abstractfactory.product.Laptop;
import at.altin.it.academy.architecture.abstractfactory.product.OperatingSystem;
import at.altin.it.academy.architecture.abstractfactory.product.Windows;

/**
 * Concrete Factory 1: LaptopFactory
 */
public class LaptopFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Laptop();
    }

    @Override
    public OperatingSystem installOperatingSystem() {
        // For simplicity, always install Windows on laptops
        return new Windows();
    }
}

