package az.coders.ada_students.lessons.lesson_17.project;

public class JEEP extends Car implements Ability{
    private String fourWheelDrive;

    public JEEP() {}

    public JEEP(String vehicle, String colour, int year, String enginePower, String fourWheelDrive) {
        super(vehicle, colour, year, enginePower);
        this.fourWheelDrive = fourWheelDrive;
    }

    public String getFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(String fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String toString() {
        return "JEEP{" +
                "vehicle='" + getVehicle() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", year=" + getYear() +
                ", enginePower='" + getEnginePower() + '\'' +
                ", fourWheelDrive='" + fourWheelDrive + '\'' +
                '}';
    }

    @Override
    public void fourWheelDrive() {
        System.out.println("Jeeps have four wheel Drive");
    }

    @Override
    public void speed() {}

    @Override
    public void comfort() {}

    @Override
    public void self_Driving() {}

}
