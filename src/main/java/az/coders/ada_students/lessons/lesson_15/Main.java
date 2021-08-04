package az.coders.ada_students.lessons.lesson_15;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.setVehicle("LASSA");
        bmw.setColour("Black");
        bmw.setYear(2021);
        bmw.setEnginePower("4.4 v8 twin turbo");
        bmw.setSelf_driving("BMW does not have any type of self-driving");
        System.out.println(bmw);

        Cars cars = new Cars();
        cars.setVehicle("Michelin");
        cars.setColour("White");
        cars.setYear(2020);
        cars.setEnginePower("Mercedes 5.5 v8");
        System.out.println(cars);
    }
}
