package az.coders.ada_students.lessons.lesson_16.hendesi_fiqurlar_project;

public class Main {

    public static void main(String[] args) {
        Fiqurlar fiqurlar = new Fiqurlar(5);

        System.out.println("=====> Fiqurların sahələri <=====");
        Cevre cevre = new Cevre(74, fiqurlar);
        System.out.println(cevre);
        System.out.print("Çevrənin qövsünün sahəsi: ");
        System.out.printf("%.4f", cevre.result(74));
        System.out.println();
        System.out.println();

        Duzbucaqli duzbucaqli = new Duzbucaqli(cevre, fiqurlar, 5);
        System.out.println(duzbucaqli);
        System.out.print("Düzbucaqlının sahəsi: ");
        System.out.printf("%.2f", duzbucaqli.result(5));
        System.out.println();
        System.out.print("Düzbucaqlının perimetri: ");
        System.out.printf("%.2f", duzbucaqli.result1(5));

        System.out.println();
        System.out.println();

        Cevre duzbucaqli1 = new Duzbucaqli(cevre,fiqurlar,16);
        System.out.println(duzbucaqli1);
        duzbucaqli1.findMethod1();
        cevre.findMethod1();

        Ucbucaq ucbucaq = new Ucbucaq(4, fiqurlar);
        System.out.println(ucbucaq);
        System.out.print("Üçbucaqın sahəsi: ");
        System.out.printf("%.2f", ucbucaq.result(4));
        System.out.println();
        System.out.print("Üçbucaqın perimetri: ");
        System.out.printf("%.2f", ucbucaq.result1(4));
        System.out.println();
        System.out.println();

        System.out.println("=====> Prosesin sonu <=====");

    }
}
