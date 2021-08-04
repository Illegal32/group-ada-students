package az.coders.ada_students.lessons.lesson_17.companyProject;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker();
        worker.workingPart();
        worker.wageSetting(865.70);
        System.out.println("Maaş : " + worker.fee() + " AZN");

        Director director = new Director();
        director.workingPart();
        director.wageSetting(5519.71);
        System.out.println("Maaş : " + director.fee() + " AZN");

        SalesMan salesMan = new SalesMan();
        salesMan.workingPart();
        salesMan.wageSetting(978.75);
        salesMan.salesCommission(250);
        System.out.println("Maaş : " + salesMan.fee() + " AZN");
        System.out.println("Kommissiya : " + salesMan.commission + "AZN");
    }
}
