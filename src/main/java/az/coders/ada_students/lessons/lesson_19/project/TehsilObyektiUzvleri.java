package az.coders.ada_students.lessons.lesson_19.project;

import java.util.Objects;

public abstract class TehsilObyektiUzvleri {

    public String name;
    public String surname;
    public int age;
    public String location;


    public TehsilObyektiUzvleri() {
    }

    public TehsilObyektiUzvleri(String name, String surname, int age, String location) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.location = location;
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
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        TehsilObyektiUzvleri that = (TehsilObyektiUzvleri) o;
        return age == that.age && name.equals(that.name) && surname.equals(that.surname) && location.equals(that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, location);
    }

    @Override
    public String toString() {
        return "TehsilObyektiUzvleri{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}
