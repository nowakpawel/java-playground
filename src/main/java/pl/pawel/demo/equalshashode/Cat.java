package pl.pawel.demo.equalshashode;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null) {
            return false;
        }

        if (object instanceof Cat) {
            Cat o = (Cat) object;
            if (name.equals(o.name) && age == o.age) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 7;

        result = 31 * result + name.hashCode();
        result = 31 * result + age;

        return result;
    }


}
