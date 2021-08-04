package az.coders.ada_students.lessons.lesson_9;

public class OOPExample {
    static String yazi;
    public static void main(String[] args) {
        OOPExample deyisen1 = new OOPExample();
        OOPExample deyisen2 = new OOPExample();
        deyisen1.yazi = "Vuqar";
        deyisen2.yazi = "Nadir";
        System.out.println(deyisen1.yazi);
        System.out.println(deyisen2.yazi);
    }
}
