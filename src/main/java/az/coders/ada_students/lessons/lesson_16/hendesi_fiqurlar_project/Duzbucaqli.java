package az.coders.ada_students.lessons.lesson_16.hendesi_fiqurlar_project;

public class Duzbucaqli extends Cevre {

    private double dioqanal;

    public Duzbucaqli(Cevre cevre, Fiqurlar fiqurlar, double dioqanal) {
        super(cevre.getDerece(), fiqurlar);
        this.dioqanal = dioqanal;
    }

    public void findMethod1(){
        System.out.println("find method duzbucaqlida cagirildi");
    }

    public double getDioqanal() {
        return dioqanal;
    }

    public void setDioqanal(double dioqanal) {
        this.dioqanal = dioqanal;
    }

    public double result(double dioqanal){
        return Math.pow(dioqanal,2) / 2 * Math.sin(Math.toRadians(getDerece()));
    }
    public double result1(double dioqanal){
        return 2 * Math.sqrt(Math.pow(dioqanal,2) + 2 * result(5));
    }

        @Override
    public String toString() {
        return "Duzbucaqli{" +
                "derece='" + getDerece() + '\'' +
                ", dioqanal=" + getDioqanal() +
                '}';
    }
}
