package az.coders.ada_students.project;

public class Telebe extends TehsilObyektiUzvleri {

    private String grade;

    public Telebe(String name, String surname, int age, String holidayFestival, String holiday, String grade) {
        super(name, surname, age, holidayFestival, holiday);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "Telebe{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", bayramSenlikleri='" + getHolidayFestival() + '\'' +
                ", tetil='" + getHoliday() + '\'' +
                "grade='" + grade + '\'' +
                '}';
    }
}
