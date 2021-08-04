package az.coders.ada_students.lessons.lesson_9.Recursion;

public class AllStarRec {
    public static void main(String[] args) {
        System.out.println(allStar("hello"));
    }
    public static String allStar(String str) {
        if(str.length() == 1 || str.equals("")) return str;
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

}
