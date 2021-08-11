package az.coders.ada_students.lessons.lesson_19.project;

import java.util.Objects;

public abstract class TehsilObyekti {

    private int club;
    private String holidayFestival;
    private String holiday;

    public TehsilObyekti() {
    }

    public TehsilObyekti(int club, String holidayFestival, String holiday) {
        this.club = club;
        this.holidayFestival = holidayFestival;
        this.holiday = holiday;
    }

    public String getClub() {
        if ( club <= 10 ) return "Siz birinci mərtəbəyə yəni uşaq bölümünə buyurun :-)";
        if ( club < 18 ) return "Siz ikinci mərtəbəyə yəni yeniyetmə bölümünə daxil olun !";
        return "Siz üçüncü mərtəbəyə yəni gənclər üçün ayrılmış bölümə daxil olun !";
    }

    public void setClub(int club) {
        this.club = club;
    }

    public String getHolidayFestival() {
        return holidayFestival;
    }

    public void setHolidayFestival(String holidayFestival) {
        this.holidayFestival = holidayFestival;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        TehsilObyekti that = (TehsilObyekti) o;
        return club == that.club && holidayFestival.equals(that.holidayFestival) && holiday.equals(that.holiday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(club, holidayFestival, holiday);
    }

    @Override
    public String toString() {
        return "TehsilObyekti{" +
                "club='" + club + '\'' +
                ", holidayFestival='" + holidayFestival + '\'' +
                ", holiday='" + holiday + '\'' +
                '}';
    }
}
