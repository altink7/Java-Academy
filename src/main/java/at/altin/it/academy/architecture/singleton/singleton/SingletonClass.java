package at.altin.it.academy.architecture.singleton.singleton;

/**
 * Singleton pattern is a design pattern that restricts the instantiation of a class to one object.
 * This is useful when exactly one object is needed to coordinate actions across the system.
 * The concept is sometimes generalized to systems that operate more efficiently when only one object exists,
 * or that restrict the instantiation to a certain number of objects.
 */
public class SingletonClass {

    /**
     * The volatile keyword ensures that multiple threads handle the uniqueInstance variable correctly
     * when it is being initialized to the Singleton instance.
     */
    private volatile static SingletonClass instance;

    /**
     * The Singleton constructor is declared private to prevent outsiders from instantiating the Singleton class.
     */
    private SingletonClass() {
    }

    /**
     * The getInstance method is declared static.
     * @return SingletonClass
     */
    public static SingletonClass getInstance() {
        // Lazy initialization (to increase performance)
        if (instance != null) {
            return instance;
        }

        // To make thread safe
        synchronized (SingletonClass.class) {
            if (instance == null) {
                instance = new SingletonClass();
            }
        }

        return instance;
    }


    public void doSomething() {
        System.out.println("Doing something ... " + this.hashCode());
    }
}
