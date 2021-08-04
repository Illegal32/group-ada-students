package az.coders.ada_students.lessons.lesson_14.vacancyProject;

public class Checker {
    public String name;
    public String surname;
    public int age;
    public String location;
    public String description;
    public int salary;


    public String checkName() {
    if(name.length() <= 2) return "Adınız qısadır! Zəhmət olmasa yenidən Adınızı daxil edin";
        return this.name = name;
    }

    public String checkSurname() {
    if(surname.length() <=3) return "Soyadınız qısadır! Zəhmət olmasa yenidən Soyadınızı daxil edin";

        return this.surname = surname;
    }

    public int checkAge() {
        if(age < 16) System.out.println("Siz hələ azyaşlısız :-)))");
        else
            System.out.println("Sizin kifayət qədər yaşınız var : ");
        return age;
    }
    public String checkDescription(){
        return this.description = description;
    }
    public int checkSalary(){
        return salary;
    }
    public String checkLocation(){ return this.location = location;}

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
