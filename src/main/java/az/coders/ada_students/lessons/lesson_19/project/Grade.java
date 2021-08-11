package az.coders.ada_students.lessons.lesson_19.project;

public enum Grade {
    A(90 + "+"),

    B(80 + "+" + "or" + 89 + "-"),

    C(70 + "+" + "or" + 79 + "-"),

    D(60 + "+" + "or" + 69 + "-"),

    F(0 + "or" + 59 + "-");

    String grade;

    Grade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}
