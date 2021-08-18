package az.coders.ada_students.lessons.lesson_20.Project;

import java.util.Objects;

public class Alıcı {
    private String name;
    private String surname;

    public Alıcı() {
    }

    public Alıcı(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        if ( name.length() < 3 ) return "Adınız qısadır. Zəhmət olmasa yenidən daxil edin.";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        if ( surname.length() < 6 ) return "Soyadınız çox qısadır. Zəhmət olmasa yenidən daxil edin.";
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Alıcı alıcı = (Alıcı) o;
        return name.equals(alıcı.name) && surname.equals(alıcı.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Alıcının adı : "+ name +
                ", soyadı : " + surname;
    }
}
