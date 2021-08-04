package az.coders.ada_students.lessons.lesson_17.project;

public class Tesla extends Car implements Ability{

    private String self_Driving;

    public Tesla(){};

    public Tesla(String vehicle, String colour, int year, String enginePower, String self_Driving) {
        super(vehicle, colour, year, enginePower);
        this.self_Driving = self_Driving;
    }

    public String getSelf_Driving() {
        return self_Driving;
    }

    public void setSelf_Driving(String self_Driving) {
        this.self_Driving = self_Driving;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "vehicle='" + getVehicle() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", year=" + getYear() +
                ", enginePower='" + getEnginePower() + '\'' +
                ", self_Driving='" + self_Driving + '\'' +
                '}';
    }

    @Override
    public void fourWheelDrive() {}

    @Override
    public void speed() {}

    @Override
    public void comfort() {}

    @Override
    public void self_Driving() {
        System.out.println("Tesla differs from other cars in its ability to drive itself.");
    }
}
