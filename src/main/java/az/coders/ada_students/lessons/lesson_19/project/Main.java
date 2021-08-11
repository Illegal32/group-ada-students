package az.coders.ada_students.lessons.lesson_19.project;

import java.util.Scanner;

public class Main {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=====> Təhsil Obyekti Üzvləri Proyekti <=====");
        System.out.println("Təhsil Obyekti Üzvləri adlı proyektimizə xoş gəlmisiz. " +
                "Proyekt Müəllimin özünü təqdim etməsi ilə başlayı daha " +
                "sonra tələbə daha sonra isə Guardianın öz məlumatlarını yerləşdirməsi ilə bitir.");

        System.out.println("Müəllimimiz zəhmət olmasa məlumatlarını qeyd etsin :-)");
        Muallim tehsilObyektiUzvleri = new Muallim();

        System.out.print("Adınız :" + " ");
        tehsilObyektiUzvleri.name = SC.next();
        System.out.print("Soyadınız :" + " ");
        tehsilObyektiUzvleri.surname = SC.next();
        System.out.print("Yaşınız :" + " ");
        tehsilObyektiUzvleri.age = SC.nextInt();
        System.out.print("Yaşadığınız şəhər :" + " ");
        tehsilObyektiUzvleri.location = SC.next();
        System.out.print("Aylıq maaş : ");
        tehsilObyektiUzvleri.setSalary((7.55 * ExtraForTeacher.dersSaati) + (3.35 * ExtraForTeacher.extraDers));
        System.out.println(tehsilObyektiUzvleri.getSalary());
        System.out.println();

        System.out.println("Tələbəmiz zəhmət olmasa məlumatlarını qeyd etsin :-)");
        TehsilObyektiUzvleri tehsilObyektiUzvleri1 = new Telebe();

        System.out.print("Adınız :" + " ");
        tehsilObyektiUzvleri1.name = SC.next();
        System.out.print("Soyadınız :" + " ");
        tehsilObyektiUzvleri1.surname = SC.next();
        System.out.print("Yaşınız :" + " ");
        tehsilObyektiUzvleri1.age = SC.nextInt();
        System.out.print("Yaşadığınız şəhər :" + " ");
        tehsilObyektiUzvleri1.location = SC.next();
        System.out.println();

        System.out.println("Guardianımız zəhmət olmasa məlumatlarını qeyd etsin :-)");
        Guardian tehsilObyektiUzvleri2 = new Guardian();

        System.out.print("Adınız :" + " ");
        tehsilObyektiUzvleri2.name = SC.next();
        System.out.print("Soyadınız :" + " ");
        tehsilObyektiUzvleri2.surname = SC.next();
        System.out.print("Yaşınız :" + " ");
        tehsilObyektiUzvleri2.age = SC.nextInt();
        System.out.print("Yaşadığınız şəhər :" + " ");
        tehsilObyektiUzvleri2.location = SC.next();
        tehsilObyektiUzvleri2.setSalary(70 * ExtraForSaver.ratio);
        System.out.print("Guardianın aldığı maaş : " + " ");
        System.out.println(tehsilObyektiUzvleri2.getSalary());
        tehsilObyektiUzvleri2.setBonus(0.5 * ExtraForSaver.piece);
        System.out.print("Guardianın aldığı əlavə maaş : " + " ");
        System.out.println(tehsilObyektiUzvleri2.getBonus());
        System.out.println();

        System.out.println(tehsilObyektiUzvleri);
        System.out.println();
        System.out.println(tehsilObyektiUzvleri1);
        System.out.println();
        System.out.println(tehsilObyektiUzvleri2);
        System.out.println();

        System.out.println("Müəllimimiz barədə məlumatlar : " + tehsilObyektiUzvleri.getName() + " " + tehsilObyektiUzvleri.getSurname() +
                " " + tehsilObyektiUzvleri.getAge() + " " + tehsilObyektiUzvleri.getLocation() + " şəhəri" +
                " " + tehsilObyektiUzvleri.getSalary() + " manat");
        System.out.println();

        System.out.println("Tələbəmiz barədə məlumatlar : " + tehsilObyektiUzvleri1.getName() + " " + tehsilObyektiUzvleri1.getSurname() +
                " " + tehsilObyektiUzvleri1.getAge() + " " + tehsilObyektiUzvleri1.getLocation() + " şəhəri");
        System.out.println();

        System.out.println("Guardian barədə məlumatlar : " + tehsilObyektiUzvleri2.getName() + " " + tehsilObyektiUzvleri2.getSurname() +
                " " + tehsilObyektiUzvleri2.getAge() + " " + tehsilObyektiUzvleri2.getLocation() + " şəhəri" +
                "//" + tehsilObyektiUzvleri2.getSalary() + " manat" + "// " + tehsilObyektiUzvleri2.getBonus() + " manat" + " Ümumi gəlir : " + tehsilObyektiUzvleri2.netice() + " manat");
        System.out.println();

        System.out.println("=====> Təhsil Obyekti Proyekti <=====");
        System.out.println();
        System.out.println("Təhsil Obyekti adlı proyektimizə xoş gəlmisiz. " +
                "Proyekt ilk universtet tələbəsinin məlumatlarının alınması ilə" +
                " başlayar sonra məktəb tələbələrinin məlumatları ilə davam edər" +
                " daha sonra isə ümumi məlumatlar ilə bitər.");


        Universtet universtet = new Universtet();
        System.out.print("Zəhmət olmasa kəsriniz varsa sayını yoxdursa 0 qeyd edin !" + " ");
        universtet.setFail(SC.nextInt());
        System.out.print("Universtetdə pullu oxuyursuzsa ödədiyiniz məbləği əks təqdirdə 0 qeyd edin !" + " ");
        universtet.setPayment(SC.nextInt());
        System.out.print("Universtetdən təqaüd alırsızsa təqaüdünüzü əks təqdirdə 0 qeyd edin !" + " ");
        universtet.setScholarship(SC.nextInt());

        System.out.println(universtet.getFail());
        System.out.println(universtet.getPayment());
        System.out.println(universtet.getScholarship());
        System.out.println();

        Scanner sc = new Scanner(System.in);

    try {
        System.out.print("ID - i öyrənmək üçün Adınızı yenidən girin !" + " ");
        ID id = ID.valueOf(sc.next());
        System.out.println(id.getId());
    }
    catch (IllegalArgumentException e) {
        System.out.println("Qeyd olunan ad tələbələr sırasında deyildir. Zəhmət olmasa yenidən ad girin !");
    }
    try {

        System.out.print("Zəhmət olmasa ortalama qiymətinin hərfini yaz ! (Misal üçün 'A')" + " ");
        Grade grade = Grade.valueOf(sc.next());
        System.out.println(grade.getGrade());
    }
    catch (IllegalArgumentException e){
        System.out.println("Qeyd etdiyiniz hərf qiymət cədvəlində yoxdur !");
    }
    try {
        System.out.print("Əgər sinifdə fərqlənirsinizsə fərqlənirilmiş adınızı girin (Misal üçün : Həvəsləndirici) əks təqdirdə 'Nothing' daxil edin" + " ");
        Scholarship scholarship = Scholarship.valueOf(sc.next());
        System.out.println(scholarship.getScholarship());
    }
    catch (IllegalArgumentException e){
        System.out.println("Qeyd etdiyiniz ada uyğun məlumat yoxdur !");
    }
        System.out.println();

        System.out.println("Bu bölüm məktəblilər üçün nəzərdə tutulmuşdur )))");
        Mekteb mekteb = new Mekteb();
        mekteb.setHolidayFestival("Yanvar və Mart aylarında böyük festivallar keçiriləcək" +
                " və sizi həmin festivala qonaq qismində görmək istəyirik :-)))");
        System.out.print("Klubda hansı mərtəbəyə getməniz üçün yenidən yaşınızı girin !" + " ");
        universtet.setClub(SC.nextInt());
        System.out.println(universtet.getClub());
        System.out.println();
        System.out.print("Geyinəcəyiniz geyim : ");
        mekteb.setUniform("Oglanlar : qara şalvar və ağ köynək" + " " +
                          "Qızlar : göy yupka və ağ köynək" +
                          " qalstuk isə xoşagələndir");
        System.out.println(mekteb.getUniform());
        mekteb.setHoliday("Tətiliniz : 29 Dekabrdan 5 Yanvara qədər və ikinci tətiliniz " +
                "18 Martdan 25 Marta qədər");
        System.out.println();
        System.out.println(mekteb.getHoliday());

        System.out.println();
        System.out.println("Ümidvarıq proyektimizi bəyəndiz :-)");
        System.out.println("=====> Proyektin sonu <=====");


    }
}