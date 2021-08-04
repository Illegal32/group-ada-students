package az.coders.ada_students.lessons.lesson_16.hendesi_fiqurlar_project;

public class Ucbucaq extends Fiqurlar {

    private double hundurluk;

    public Ucbucaq(){

    }

    public Ucbucaq(double hundurluk, Fiqurlar fiqurlar) {
        super(fiqurlar.getDeger());
        this.hundurluk = hundurluk;
    }

    public double getHundurluk() {
        return hundurluk;
    }

    public void setHundurluk(double hundurluk) {
        this.hundurluk = hundurluk;
    }

    public double result(double hundurluk){
        return getDeger() * hundurluk / 2;
    }
    public double result1(double hundurluk) {
        double r = Math.sqrt(Math.pow(getDeger(),2) - Math.pow(hundurluk,2));
        return (2 * r) + (2 * getDeger());
    }

    @Override
    public String toString() {
        return "Ucbucaq{" +
                "deger='" + getDeger() + '\'' +
                "hundurluk=" + getHundurluk() +
                '}';
    }
}
