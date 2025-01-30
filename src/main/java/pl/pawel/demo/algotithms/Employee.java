package pl.pawel.demo.algotithms;

public class Employee {
    int id;
    String name;
    String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "[Employee " +
                "id = " + id +
                ", name = '" + name + '\'' +
                " ]";
    }
}
