package at.altin.it.academy.architecture.prototype.prototype;

/**
 * Concrete Prototype: BasicMobilePhone
 */
public class BasicMobilePhone implements MobilePhone {
    String brand;
    String model;
    String imei;

    public BasicMobilePhone(String brand, String model, String imei) {
        this.brand = brand;
        this.model = model;
        this.imei = imei;
    }

    @Override
    public MobilePhone clone() throws CloneNotSupportedException {
        return (MobilePhone) super.clone();
    }

    @Override
    public void displayInfo() {
        System.out.println("BasicMobilePhone: " + brand + " " + model + " " + imei);
    }
}
