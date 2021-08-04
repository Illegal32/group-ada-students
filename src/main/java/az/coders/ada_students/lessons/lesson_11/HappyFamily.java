package az.coders.ada_students.lessons.lesson_11;

class Pet {
    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    public String habits;
    public Pet(String species, String nickname, int age, int trickLevel, String habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {
    }

    //Pet(){
    //     System.out.println("This is about Pet");
    //  }
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "dog{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits + "}";
    }
}

class Human {

    public String name;
    public String surname;
    public int year;
    public int IQLevel;
    public Human(String name, String surname, int year, int IQLevel) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQLevel = IQLevel;
    }

    public Human() {
    }

    public String Father() {
        {
            return ", father=" + name + ", pet=";
        }
    }

    public String Mother() {
        return ", mother=" + name;
    }

    public void print2() {
        System.out.print(this + " ");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", IQLevel=" + IQLevel;
    }
}

public class HappyFamily {

    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.nickname = "Rock";
        pet.age = 5;
        pet.trickLevel = 75;
        pet.habits = "[eat, drink, sleep]";
        pet.print();

        Human human = new Human();
        Human mother = new Human();
        Human father = new Human();
        human.name = "Michael";
        human.surname = "Karleone";
        human.year = 1977;
        human.IQLevel = 90;

        mother.name = "Jane Karleone";
        father.name = "Vito Karleone";
        human.print2();
        System.out.print(mother.Mother() + " ");
        System.out.print(father.Father());
        pet.print();

    }
}
