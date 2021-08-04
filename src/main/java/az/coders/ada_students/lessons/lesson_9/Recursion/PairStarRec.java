package az.coders.ada_students.lessons.lesson_9.Recursion;

public class PairStarRec {
    public static void main(String[] args) {
        System.out.println(pairStar("Hello"));
    }
    public static String pairStar(String str) {
        if(str.length() == 1 || str.equals("")) return str;
        if(str.charAt(0) == str.charAt(1)) return str.charAt(0) + "*" + pairStar(str.substring(1));
        else return str.charAt(0) + pairStar(str.substring(1));
    }
}
