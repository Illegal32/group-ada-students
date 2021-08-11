package az.coders.ada_students.lessons.lesson_19.project;

public enum Scholarship {
    Əlaçı(150 + " manat"),
    Həvəsləndirici(120 + " manat"),
    Adi(100 + " manat"),
    Nothing("Təəssüf edirik siz bu semestrlik təqaüd almırsız :-(");

    String scholarship;
    Scholarship(String scholarship) {
        this.scholarship = scholarship;
    }

    public String getScholarship() {
        return scholarship;
    }
}
