package az.coders.ada_students.lessons.lesson_19.project;

public enum ID {
    Nadir(12121),
    Togrul(12122),
    Nabat(12123),
    Ali(12124),
    Gozel(12125),
    Sahib(12126),
    Nazli(12127),
    Murad(12128),
    Gunay(12129),
    Terlan(12130),
    Sevinc(12131),
    Yusif(12132),
    Nermin(12134),
    Nizami(12135),
    Leyla(12136),
    Kerem(12137),
    Lale(12138),
    Nezaket(12139),
    Nurlan(12140);

    int id;

    ID(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
