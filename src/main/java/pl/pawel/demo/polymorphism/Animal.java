package pl.pawel.demo.polymorphism;

public interface Animal {
    void talk();
    int getNumberOfLegs();

    default void sleep() {
        System.out.println("Sleeping");
    }

    default void wakeUp() {
        System.out.println("Woke up!");
    }

}
