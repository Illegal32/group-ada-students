package az.coders.ada_students.lessons.lesson_17.project;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.setVehicle("Lassa");
        bmw.setColour("Black");
        bmw.setYear(2021);
        bmw.setEnginePower("BMW 4.4 V8 twin turbo");
        bmw.setSpeed("Max speed 360 km/h");
        System.out.println(bmw);
        bmw.speed();

        Merc merc = new Merc();
        merc.setVehicle("Nexen");
        merc.setColour("White");
        merc.setYear(2020);
        merc.setEnginePower("Mercedes 4.0-liter biturbo V8");
        merc.setComfort("Relaxing :-)))");
        System.out.println(merc);
        merc.comfort();

        JEEP jeep = new JEEP();
        jeep.setVehicle("Marshal");
        jeep.setColour("Blue");
        jeep.setYear(2015);
        jeep.setEnginePower("JEEP 3.0-liter V6 diesel");
        jeep.setFourWheelDrive("4 X 4");
        System.out.println(jeep);
        jeep.fourWheelDrive();

        Tesla tesla = new Tesla();
        tesla.setVehicle("Riken");
        tesla.setColour("Gray");
        tesla.setYear(2018);
        tesla.setEnginePower("Tesla 503 hp@ 6,150 rpm (375 kw)");
        tesla.setSelf_Driving("AUTO");
        System.out.println(tesla);
        tesla.self_Driving();

    }
}
