package az.coders.ada_students.project;

public class Universtet extends TehsilObyektiUzvleri {

    private String club;
    private String fail;
    private String payment;
    private String scholarship;

    public Universtet(String name, String surname, int age, String holidayFestival, String holiday, String club, String fail, String payment, String scholarship) {
        super(name, surname, age, holidayFestival, holiday);
        this.club = club;
        this.fail = fail;
        this.payment = payment;
        this.scholarship = scholarship;
    }

    public Universtet() {

    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getFail() {
        return fail;
    }

    public void setFail(String fail) {
        this.fail = fail;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getScholarship() {
        return scholarship;
    }

    public void setScholarship(String scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "Universtet{" +
                "club='" + club + '\'' +
                ", fail='" + fail + '\'' +
                ", payment='" + payment + '\'' +
                ", scholarship='" + scholarship + '\'' +
                '}';
    }
}
