package pl.pawel.demo.comparablecomparator;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
     }

    @Override
    public int compareTo(Person o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.surname.compareTo(o.surname);
        }

        return result;
    }

    @Override
    public String toString() {
        return "Person [" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ']';
    }
}
