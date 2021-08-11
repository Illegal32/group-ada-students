package az.coders.ada_students.lessons.lesson_19.project;

public class Guardian extends TehsilObyektiUzvleri implements ExtraForSaver {

    public double salary;
    public double bonus;

    public Guardian(String name, String surname, int age, String location, double salary, double bonus) {
        super(name, surname, age, location);
        this.salary = salary;
        this.bonus = bonus;
    }

    public Guardian() {

    }

    public double getSalary() {
        return 70 * ratio;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return 0.5 * piece;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double netice() {
        return getSalary() + getBonus();
    }

    @Override
    public String toString() {
        return "Guardian{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", salary='" + getSalary() + '\'' +
                ", bonus='" + getBonus() + '\'' +
                ", ümumi maaş='" + netice() +
                '}';
    }
}
