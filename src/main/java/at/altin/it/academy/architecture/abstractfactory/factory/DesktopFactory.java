package at.altin.it.academy.architecture.abstractfactory.factory;

import at.altin.it.academy.architecture.abstractfactory.product.Computer;
import at.altin.it.academy.architecture.abstractfactory.product.Desktop;
import at.altin.it.academy.architecture.abstractfactory.product.MacOS;
import at.altin.it.academy.architecture.abstractfactory.product.OperatingSystem;

/**
 * Concrete Factory 2: DesktopFactory
 */
public class DesktopFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Desktop();
    }

    @Override
    public OperatingSystem installOperatingSystem() {
        // For simplicity, always install MacOS on desktops
        return new MacOS();
    }
}
