package az.coders.ada_students.lessons.lesson_19.project;

public class Telebe extends TehsilObyektiUzvleri {

    public Telebe(String name, String surname, int age, String location) {
        super(name, surname, age, location);
    }

    public Telebe() {
    }


    @Override
    public String toString() {
        return "Telebe{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
