package az.coders.ada_students.lessons.lesson_17.companyProject;

public class SalesMan implements Işləyənlər{

    double wageConstant;
    double commission;
    final double commissionRate = 0.3;

    @Override
    public double fee() {
        return ((wageConstant * ratio) + commissionRate);
    }

    @Override
    public void workingPart() {
        System.out.println("=====> Satici <=====");
    }

    @Override
    public void wageSetting(double wageConstant) {
        this.wageConstant = wageConstant;
    }

    public void salesCommission(int piece){
        commission = piece * commissionRate;
    }
}
