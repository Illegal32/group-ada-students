package az.coders.ada_students.lessons.lesson_14.vacancyProject;

import java.util.Scanner;

public class Data {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        System.out.println("------------ Özünüz barədə məlumatları daxil edin ------------");
        Checker checker = new Checker();
        System.out.print("Adınız :" + " ");
        checker.name = SC.next();
        System.out.print("Soyadınız :" + " ");
        checker.surname = SC.next();
        System.out.print("Yaşınız :" + " ");
        checker.age = SC.nextInt();
        System.out.print("Yaşadığınız şəhər (Misal üçün : Bakı) :" + " ");
        String key2 = checker.location = SC.next();
        System.out.print("Developer olduğunuz sahənizi qeyd edin (Misal üçün :  Java ) :" + " ");
        String key1 = checker.description = SC.next();
        System.out.print("Nə qədər maaş istərdiz :" + " ");
        checker.salary = SC.nextInt();
        System.out.println();
        System.out.println("------------ Məlumatlarınıza dəqiqliyi üçün yenidən nəzər yetirin ------------");
        System.out.println("Istifadəçinin adı :" + " " + checker.checkName());
        System.out.println("Istifadəçinin soyadı :" + " " + checker.checkSurname());
        System.out.println("Istifadəçinin yaşı :" + " " + checker.checkAge());
        System.out.println("Istifadəçinin yaşadığı şəhər" + " " + checker.checkLocation());
        System.out.println("Istifadəçi barədə məlumat :" + " " + checker.checkDescription() + " developer");
        System.out.print("Istifadəçinin istədiyi maaş :" + " " + checker.checkSalary());
        System.out.println();
        System.out.println();

        System.out.println();

        System.out.print("Sizə uyğun vakansiyalarımız : ");
        System.out.println();

        showData(findWithKey(key1));
    }

    private static Checker2[] findWithKey(String key1) {
        Melumat.loadData();
        Checker2[] arr = new Checker2[7];
        for (int i = 0; i < Melumat.checker2.length; i++) {
            if ( Melumat.checker2[i].getDescription().contains(key1) )
                arr[i] = Melumat.checker2[i];
//            System.out.println("Sizə uyğun vakansiyamız yoxdur :-(((");
        }
        return arr;
    }

    private static void showData(Checker2[] arr) {
        for (Checker2 checker2 : arr) {
            if ( checker2 != null )
                System.out.println(checker2);
        }
    }
}