package at.altin.it.academy.architecture.prototype.client;

import at.altin.it.academy.architecture.prototype.prototype.BasicMobilePhone;
import at.altin.it.academy.architecture.prototype.prototype.MobilePhone;

/**
 * Client code using the Prototype pattern
 */
public class PrototypeExampleSimulation {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create a prototype of a basic mobile phone
        MobilePhone basicPhonePrototype = new BasicMobilePhone("AltinIT", "BasicPhone", "123456789");

        // Create new mobile phones by cloning the prototype
        MobilePhone phone1 = basicPhonePrototype.clone();
        MobilePhone phone2 = basicPhonePrototype.clone();

        // Display information about the cloned phones
        phone1.displayInfo();
        phone2.displayInfo();
    }
}
