package az.coders.ada_students.lessons.lesson_16.hendesi_fiqurlar_project;

public class Fiqurlar {

    private double deger;

    public Fiqurlar() {
    }

    public Fiqurlar(double deger) {
        this.deger = deger;
    }

    public double getDeger() {
        return deger;
    }

    public void setDeger(double deger) {
        this.deger = deger;
    }

    @Override
    public String toString() {
        return "Fiqurlar{" +
                "deger='" + deger + '\'' +
                '}';
    }
}
