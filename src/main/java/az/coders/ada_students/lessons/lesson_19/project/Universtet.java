package az.coders.ada_students.lessons.lesson_19.project;

import java.util.Objects;

public class Universtet extends TehsilObyekti {

    private int fail;
    private int payment;
    private int scholarship;

    public Universtet(int club, String holidayFestival, String holiday, int fail, int payment, int scholarship) {
        super(club, holidayFestival, holiday);
        this.fail = fail;
        this.payment = payment;
        this.scholarship = scholarship;
    }

    public Universtet() {
    }

    public Object getFail() {
        if ( fail == 0 ) return "Sizin bu semestrlik kəsriniz yoxdur :-)))";
        else if ( fail > 0 ) return "Sizin kəsriniz vardır və kəsrinizin sayı : " + this.fail;

        return this.fail;
    }

    public void setFail(int fail) {
        this.fail = fail;
    }

    public Object getPayment() {
        if ( payment == 0 ) return "Siz ödənişsiz təhsil alırsınız. 'Əhsən!' ";
        if ( payment > 0 ) return "Siz ödənişli təhsil alırsınız və sizin ödəniş : " + this.payment;
        return this.payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public Object getScholarship() {
        if ( scholarship == 0 ) return "Siz təqaüd almırsız :-(";
        if ( scholarship > 0 ) return "Sizin təqaüd : " + this.scholarship;
        return this.scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals(o) ) return false;
        Universtet that = (Universtet) o;
        return fail == that.fail && payment == that.payment && scholarship == that.scholarship;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fail, payment, scholarship);
    }

    @Override
    public String toString() {
        return "Universtet{" +
                "club='" + getClub() + '\'' +
                "fail='" + fail + '\'' +
                ", payment='" + payment + '\'' +
                ", scholarship='" + scholarship + '\'' +
                '}';
    }

}
