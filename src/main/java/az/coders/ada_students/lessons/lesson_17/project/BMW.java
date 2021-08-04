package az.coders.ada_students.lessons.lesson_17.project;

public class BMW extends Car implements Ability{

    private String speed;

    public BMW(){};

    public BMW(String vehicle, String colour, int year, String enginePower, String speed) {
        super(vehicle, colour, year, enginePower);
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "vehicle='" + getVehicle() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", year=" + getYear() +
                ", enginePower='" + getEnginePower() + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }

    @Override
    public void fourWheelDrive() {}

    @Override
    public void speed() {
        System.out.println("BMW has a extra speed");
    }

    @Override
    public void comfort() {}

    @Override
    public void self_Driving() {}
}
