package pl.pawel.demo.polymorphism;

public class Bird implements Animal {
    @Override
    public void talk() {
        System.out.println("Ćwir Ćwir");
    }

    @Override
    public int getNumberOfLegs() {
        return 2;
    }
}
