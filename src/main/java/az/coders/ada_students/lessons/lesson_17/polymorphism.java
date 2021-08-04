package az.coders.ada_students.lessons.lesson_17;

class UstSinif {
    public void yaz() {
        System.out.println("Burasi ustsinif");
    }
}

class AltSinif1 extends UstSinif {
    public void yaz() {
        System.out.println("Burasi altsinif1");
    }
}

class Altsinif2 extends UstSinif {
    public void yaz() {
        System.out.println("Burasi altsinif2");
    }
}

public class polymorphism {
    public static void nesneAl(UstSinif nesne) {
        nesne.yaz();
    }

    public static void main(String[] args) {
        UstSinif ustSinif = new UstSinif();
        AltSinif1 altSinif1 = new AltSinif1();
        Altsinif2 altSinif2 = new Altsinif2();
        nesneAl(ustSinif);
        nesneAl(altSinif1);
        nesneAl(altSinif2);
    }

}
