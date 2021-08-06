package az.coders.ada_students.project;

import java.util.Scanner;

public class Main {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=====> Mekteb Proyekti <=====");
        TehsilObyektiUzvleri tehsilObyektiUzvleri = new TehsilObyektiUzvleri();
        System.out.print("Adınız :" + " ");
        tehsilObyektiUzvleri.name = SC.next();
        System.out.print("Soyadınız :" + " ");
        tehsilObyektiUzvleri.surname = SC.next();
        System.out.print("Yaşınız :" + " ");
        tehsilObyektiUzvleri.age = SC.nextInt();
        tehsilObyektiUzvleri.setHolidayFestival("Yanvar və Mart aylarında böyük festivallar keçiriləcək" +
                " və sizi həmin festivala qonaq qismində görmək istəyirik :-)))");
        tehsilObyektiUzvleri.setHoliday("29 Dekabrdan 5 Yanvara qədər" +
                                        "18 Martdan 25 Marta qədər");
        System.out.println(tehsilObyektiUzvleri);

        Muallim muallim = new Muallim();


    }
}
