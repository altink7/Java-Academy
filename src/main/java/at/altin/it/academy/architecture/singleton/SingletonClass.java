package at.altin.it.academy.architecture.singleton;

public class SingletonClass {

    private static SingletonClass instance;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (instance != null) {
            return instance;
        }

        synchronized (SingletonClass.class) {
            if (instance == null) {
                instance = new SingletonClass();
            }
        }

        return instance;
    }
}
