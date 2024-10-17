package at.altin.fh.eww.oop;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();

        Dog dog = new Dog("dog", 5);

        System.out.println(dog);

        dog.setAlter(7);
        dog.setName("neuer Name");

        System.out.println(dog);

    }
}
