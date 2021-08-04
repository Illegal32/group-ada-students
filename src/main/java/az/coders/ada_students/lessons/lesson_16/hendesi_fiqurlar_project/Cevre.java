package az.coders.ada_students.lessons.lesson_16.hendesi_fiqurlar_project;

public class Cevre extends Fiqurlar {

    private double derece;

    public Cevre(double derece, Fiqurlar fiqurlar) {
        super(fiqurlar.getDeger());
        this.derece = derece;
    }

    public void findMethod1() {
        System.out.println("find method cevrece cagirildi");
    }

    public double getDerece() {
        return derece;
    }

    public void setDerece(double derece) {
        this.derece = derece;
    }

    private static final double PI = 3.14;

    public double result(double derece) {
        return PI * Math.pow(getDeger(), 2) * (derece / 360);
    }

    @Override
    public String toString() {
        return "Cevre{" +
                "deger='" + getDeger() + '\'' +
                ", derece=" + getDerece() +
                '}';
    }

}
