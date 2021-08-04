package az.coders.ada_students.lessons.lesson_17.project;

public class Merc extends Car implements Ability {

    private String comfort;

    public Merc(){};

    public Merc(String vehicle, String colour, int year, String enginePower, String comfort) {
        super(vehicle, colour, year, enginePower);
        this.comfort = comfort;
    }

    public String getComfort() {
        return comfort;
    }

    public void setComfort(String comfort) {
        this.comfort = comfort;
    }

    @Override
    public String toString() {
        return "Merc{" +
                "vehicle='" + getVehicle() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", year=" + getYear() +
                ", enginePower='" + getEnginePower() + '\'' +
                ", comfort='" + comfort + '\'' +
                '}';
    }

    @Override
    public void fourWheelDrive() {}

    @Override
    public void speed() {}

    @Override
    public void comfort() {
        System.out.println("Mercedes has a extra comfort");
    }

    @Override
    public void self_Driving() {}
}
