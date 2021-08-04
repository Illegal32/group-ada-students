package az.coders.ada_students.lessons.lesson_9.Recursion;

public class ChangeXYRec {
    public static void main(String[] args) {
        System.out.println(changeXY("XjvjjJHYXX"));
    }
    public static String changeXY(String str) {
        if(str.length() == 0) return str;
        if(str.charAt(0) == 'X') return 'Y' + changeXY(str.substring(1));
        return str.charAt(0) + changeXY(str.substring(1));
    }

}
