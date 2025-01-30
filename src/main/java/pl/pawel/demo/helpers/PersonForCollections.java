package pl.pawel.demo.helpers;

public class PersonForCollections {
    private String name;
    private String email;

    public PersonForCollections(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "PersonForCollections [" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ']';
    }
}
