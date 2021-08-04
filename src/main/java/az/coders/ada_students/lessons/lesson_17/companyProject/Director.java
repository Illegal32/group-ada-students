package az.coders.ada_students.lessons.lesson_17.companyProject;

public class Director implements Işləyənlər{

    double wageConstant;

    @Override
    public double fee() {
        return wageConstant;
    }

    @Override
    public void workingPart() {
        System.out.println("=====> Direktor <=====");
    }

    @Override
    public void wageSetting(double wageConstant) {
        this.wageConstant = wageConstant;
    }

}
