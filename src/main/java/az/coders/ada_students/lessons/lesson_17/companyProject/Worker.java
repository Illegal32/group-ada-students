package az.coders.ada_students.lessons.lesson_17.companyProject;

public class Worker implements Işləyənlər{
    double wageConstant;

    @Override
    public double fee(){
        return wageConstant * ratio;
    }

    @Override
    public void workingPart(){
        System.out.println("=====> Isci <=====");
    }

    @Override
    public void wageSetting(double wageConstant){
        this.wageConstant = wageConstant;
    }
}
