package az.coders.ada_students.lessons.lesson_19.project;

public class Muallim extends TehsilObyektiUzvleri implements ExtraForTeacher {

    private double salary;

    public Muallim(String name, String surname, int age, String location, double salary) {
        super(name, surname, age, location);
        this.salary = salary;
    }

    public Muallim() {
        super();
    }

    public double getSalary() {
        return (7.55 * dersSaati) + (3.35 * extraDers);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Muallim{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", location='" + getLocation() + '\'' +
                ", salary='" + getSalary() + '\'' +
                '}';
    }
}


//universtet adini yazirsan hemcinin usaqin adini yazirsan eger varsa mektebini cixarir
//mekteb varsa mekteb cixsin

//        tehsilObyektiUzvleri.setHolidayFestival("Yanvar və Mart aylarında böyük festivallar keçiriləcək" +
//                " və sizi həmin festivala qonaq qismində görmək istəyirik :-)))");
//        tehsilObyektiUzvleri.setHoliday("29 Dekabrdan 5 Yanvara qədər" +
//                                        "18 Martdan 25 Marta qədər");