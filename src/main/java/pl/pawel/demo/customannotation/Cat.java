package pl.pawel.demo.customannotation;

@VeryImportant
public class Cat {
    private String name;
    private int age;

    public Cat(String name) {
        this.name = name;
    }

    @RunImmediately(times = 5)
    public void meow() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("Munch");
    }
}
