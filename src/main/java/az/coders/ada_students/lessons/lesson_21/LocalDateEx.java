package az.coders.ada_students.lessons.lesson_21;

import java.time.Month;
import java.time.ZoneId;

public class LocalDateEx {
    public static void main(String[] args) {
        java.time.LocalDate localDate = java.time.LocalDate.now(ZoneId.of("UTC"));
        System.out.println(localDate);

        localDate = java.time.LocalDate.of(2020, 11, 8);
        System.out.println(localDate);

        localDate = java.time.LocalDate.of(2020, Month.APRIL, 8);
        System.out.println(localDate);


        System.out.println(java.time.LocalDate.now().toString());



    }
}
