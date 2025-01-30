package pl.pawel.demo.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();

        System.out.println("\n-------------\n");
        System.out.println("Bird\n");
        bird.talk();
        System.out.println(bird.getNumberOfLegs());
        bird.sleep();
        bird.wakeUp();
    }
}
