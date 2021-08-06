package az.coders.ada_students.project;

public class Saver extends TehsilObyektiUzvleri implements ExtraForSaver{

    private String salary;
    private String bonus;

    public Saver(String name, String surname, int age, String holidayFestival, String holiday, String salary, String bonus) {
        super(name, surname, age, holidayFestival, holiday);
        this.salary = salary;
        this.bonus = bonus;
    }

    public Saver() {

    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public double extraMaas(){
        return ratio * piece;

    }

    @Override
    public String toString() {
        return "Saver{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", bayramSenlikleri='" + getHolidayFestival() + '\'' +
                ", tetil='" + getHoliday() + '\'' +
                "salary='" + salary + '\'' +
                ", bonus='" + bonus + '\'' +
                '}';
    }
}
