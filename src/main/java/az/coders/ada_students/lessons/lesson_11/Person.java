package az.coders.ada_students.lessons.lesson_11;

public class Person {
    //class members
    //fields
    //properties
    //variable
    //metodun icerisinde olan variable local variabledir
    //metod daxilinde olmayan variableler ise instance variabledir
    public String name; // local variable
    public String surname;
    public int age;
    public String gender;

    public void print() {
        System.out.print(name + " ");
        System.out.print(surname + " ");
        System.out.print(age + " ");
        System.out.println(gender);
        System.out.println(this);
    }

    public boolean checkName(String name) {
        return this.name.equals("Nabat"); //local variable
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
