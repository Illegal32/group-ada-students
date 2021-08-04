package az.coders.ada_students.lessons.lesson_13;

import java.util.Arrays;

public class Humans {
    private String name;
    private String surname;
    private int age;
    private String hobbies;
    private Humans father;
    private Humans mother;
    private Humans brother;
    private Humans brother2;
    private Animal[] animals;

    public Humans(String name, String surname, int age, String hobbies) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hobbies = hobbies;
    }

    public Humans(){}

    public void AnimalClass(){}

    public Humans getFather() {
        return father;
    }
    public void setFather(Humans father){
        this.father = father;
    }

    public Humans getMother() {
        return mother;
    }

    public void setMother(Humans mother) {
        this.mother = mother;
    }

    public Humans getBrother() {
        return brother;
    }

    public void setBrother(Humans brother) {
        this.brother = brother;
    }
    public Humans getBrother2() {
        return brother2;
    }

    public void setBrother2(Humans brother2) {
        this.brother2 = brother2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Humans{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                ", father=" + father +
                ", mother=" + mother +
                ", brother=" + brother +
                ", brother2=" + brother2 +
                ", animalClass=" + Arrays.toString(animals) +
                '}';
    }
}
