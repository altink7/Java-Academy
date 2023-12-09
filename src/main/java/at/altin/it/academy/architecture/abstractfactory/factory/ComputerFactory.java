package at.altin.it.academy.architecture.abstractfactory.factory;

import at.altin.it.academy.architecture.abstractfactory.product.Computer;
import at.altin.it.academy.architecture.abstractfactory.product.OperatingSystem;

/**
 * Abstract Factory interface
 */
public interface ComputerFactory {
    Computer createComputer();
    OperatingSystem installOperatingSystem();
}
