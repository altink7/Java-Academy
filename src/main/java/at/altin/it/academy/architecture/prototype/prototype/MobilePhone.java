package at.altin.it.academy.architecture.prototype.prototype;

/**
 * Prototype interface
 */
public interface MobilePhone extends Cloneable {
    MobilePhone clone() throws CloneNotSupportedException;
    void displayInfo();
}
