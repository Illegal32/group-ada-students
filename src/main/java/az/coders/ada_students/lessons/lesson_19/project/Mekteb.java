package az.coders.ada_students.lessons.lesson_19.project;

import java.util.Objects;

public class Mekteb extends TehsilObyekti {

    private String uniform;

    public Mekteb(int club, String holidayFestival, String holiday, String uniform) {
        super(club, holidayFestival, holiday);
        this.uniform = uniform;
    }

    public Mekteb() {}

    public String getUniform() {
        return uniform;
    }

    public void setUniform(String uniform) {
        this.uniform = uniform;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals(o) ) return false;
        Mekteb mekteb = (Mekteb) o;
        return uniform.equals(mekteb.uniform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), uniform);
    }

    @Override
    public String toString() {
        return "Mekteb{" +
                "club='" + getClub() + '\'' +
                ", holidayFestival='" + getHolidayFestival() + '\'' +
                ", holiday='" + getHoliday() + '\'' +
                ", uniform='" + uniform + '\'' +
                '}';
    }
}
