package az.coders.ada_students.lessons.lesson_11;

public class Main {
    public static void main(String[] args) {
        //create an object
        //person == reference
        Person person = new Person();
        person.name = "Nadir";
        person.surname = "Jabbarli";
        person.age = 19;
        person.gender = "Male";
//        System.out.print(person.name + " ");
//        System.out.print(person.surname + " ");
//        System.out.print(person.age + " ");
//        System.out.println(person.gender);
//          System.out.println(person);
        person.print();
        System.out.println(person.checkName(person.name));
    }
}