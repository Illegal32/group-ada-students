package az.coders.ada_students.lessons.lesson_13;

import java.util.Arrays;

public class Animal {
    private String species;
    private String nickname;
    private int age;
    private String[] activities;

    public Animal(String species, String nickname, int age, String[] activities) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.activities = activities;
    }

    public Animal() {}

    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getActivities() {
        return activities;
    }

    public void setActivities(String[] activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", activities='" + Arrays.toString(activities) + '\'' +
                '}';
    }
}
