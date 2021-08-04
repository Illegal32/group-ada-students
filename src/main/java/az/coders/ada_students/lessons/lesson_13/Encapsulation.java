package az.coders.ada_students.lessons.lesson_13;

public class Encapsulation {

    public static void main(String[] args) {
        Humans giris = new Humans();
        giris.setName("Nadir");
        giris.setSurname("Jabbarli");
        giris.setAge(19);
        giris.setHobbies("Playing the guitar and driving a car");
        Humans father = new Humans("qwer", "Cabbarov", 40, "To sit alone and watch the mountains");
        Humans mother = new Humans("qwert", "Cabbarov", 40, "Watching a film and draw a picture");
        Humans brother = new Humans("qwer", "Cabbarli", 30, "Interested in animals");
        Humans brother2 = new Humans("qwert", "Cabbarli", 30, "Playing a game");
        giris.setFather(father);
        giris.setMother(mother);
        giris.setBrother(brother);
        giris.setBrother2(brother2);
        Animal it = new Animal();
        it.setNickname("Bars");
        it.setSpecies("Qurdbasar");
        it.setAge(2);
        it.setActivities(new String[]{"Playing toys", "barking"});
        int[] i = new int[3];
        Animal[] animals = new Animal[2];
        i[0] = 5;
        animals[0] = it;

        Animal pisik = new Animal();
        pisik.setNickname("Lazy");
        pisik.setSpecies("Skottiş");
        pisik.setAge(3);
        pisik.setActivities(new String[]{"Sleeping"});
        animals[1] = pisik;
        giris.setAnimals(animals);

        System.out.print(giris);
//        System.out.print(father + ", ");
//        System.out.print(mother + ", ");
//        System.out.print(brother + ", ");
//        System.out.println(brother2 + "}");
//        System.out.println(it);
//        System.out.println(pisik);
    }
}
