package Singleton;

public class Singleton {
    //Thread Safe implementation

    //data member marked as volatile
    static volatile Singleton instance = null;

    //constructor private
    private Singleton() {

    }

    //Double checked Locking
    static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
    //Lazy loading
    /*
    //data member
    static Singleton instance = null;

    //constructor private
    private Singleton() {

    }

    static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }*/

    //Eager Loading
    /*
    //data member
    static Singleton instance = new Singleton();

    //constructor private
    private Singleton() {

    }

    static Singleton getInstance() {
        return instance;
    }*/

    public void sayHello() {
        System.out.println("Hi, I m a Singleton Class");
        System.out.println(instance);
    }
}
