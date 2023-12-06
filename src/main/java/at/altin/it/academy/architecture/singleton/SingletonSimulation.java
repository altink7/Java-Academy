package at.altin.it.academy.architecture.singleton;

import at.altin.it.academy.architecture.singleton.singleton.SingletonClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class SingletonSimulation {

    public static void main(String[] args) {
        SingletonClass singleton = SingletonClass.getInstance();
        singleton.doSomething();
        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.doSomething();
        System.out.println("singleton == singletonClass: " + (singleton == singletonClass));

        tryUsingReflections();
    }

    private static void tryUsingReflections() {
        try {
            // Get the singleton class
            Class<?> singletonClass = Class
                    .forName("at.altin.it.academy.architecture.singleton.singleton.SingletonClass");

            // Get the private constructor
            Constructor<?> privateConstructor = singletonClass.getDeclaredConstructor();

            // Set the accessibility to true
            privateConstructor.setAccessible(true);

            // Create an instance using the now accessible constructor
            SingletonClass singleton = (SingletonClass) privateConstructor.newInstance();
            singleton.doSomething();

            // Attempt to create another instance using reflection
            SingletonClass singleton2 = (SingletonClass) privateConstructor.newInstance();
            singleton2.doSomething();

            System.out.println("singleton == singleton2: " + (singleton == singleton2));

            // Close the loophole by throwing an exception if an attempt is made to create a new instance using reflection
            Field instanceField = singletonClass.getDeclaredField("instance");
            instanceField.setAccessible(true);
            instanceField.set(null, null);

            // Attempt to create another instance after setting the instance to null
            SingletonClass singleton3 = SingletonClass.getInstance();
            singleton3.doSomething();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
