package az.coders.ada_students.lessons.lesson_14.vacancyProject;

public class Checker2 {
    private String company_name;
    private String location;
    private int age;
    private String description;
    private double salary;


    public Checker2() {}

    public Checker2(String company_name, String location, int age, String description, double salary) {
        this.company_name = company_name;
        this.location = location;
        this.age = age;
        this.description = description;
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Vacancy{" +
                "company_name='" + company_name + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                ", salary=" + salary +
                '}';
    }
}