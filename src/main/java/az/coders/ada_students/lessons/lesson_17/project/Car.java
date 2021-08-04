package az.coders.ada_students.lessons.lesson_17.project;

public class Car {

    private String vehicle;
    private String colour;
    private int year;
    private String enginePower;

    public Car(){}

    public Car(String vehicle, String colour, int year, String enginePower) {
        this.vehicle = vehicle;
        this.colour = colour;
        this.year = year;
        this.enginePower = enginePower;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "vehicle='" + vehicle + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", enginePower='" + enginePower + '\'' +
                '}';
    }

}
