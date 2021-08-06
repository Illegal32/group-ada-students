package az.coders.ada_students.project;

public class TehsilObyektiUzvleri {

    public String name;
    public String surname;
    public int age;
    public String holidayFestival;
    public String holiday;


    public TehsilObyektiUzvleri() {
    }

    public TehsilObyektiUzvleri(String name, String surname, int age, String holidayFestival, String holiday) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.holidayFestival = holidayFestival;
        this.holiday = holiday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
    public String toString() {
        return "TehsilObyekti{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", bayramSenlikleri='" + holidayFestival + '\'' +
                ", tetil='" + holiday + '\'' +
                '}';
    }
}
