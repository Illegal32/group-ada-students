package az.coders.ada_students.lessons.lesson_15;

public class BMW extends Cars {
    private String self_driving;

    public String getSelf_driving() {
        return self_driving;
    }

    public void setSelf_driving(String self_driving) {
        this.self_driving = self_driving;
    }


    @Override
    public String toString() {
        return "BMW{" +
                "vehicle='" + getVehicle() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", year=" + getYear() +
                ", enginePower='" + getEnginePower() + '\'' +
                ", self_driving='" + self_driving + '\'' +
                '}';
    }
}
