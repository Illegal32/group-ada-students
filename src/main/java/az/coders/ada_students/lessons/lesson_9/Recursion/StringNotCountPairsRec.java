package az.coders.ada_students.lessons.lesson_9.Recursion;

public class StringNotCountPairsRec {
    public static void main(String[] args) {
        System.out.println(stringClean("xxellhhouhhytreo"));
    }
    public static String stringClean(String str) {
    if(str.length() == 0 || str.length() < 2) return str;
    if(str.charAt(0) == str.charAt(1)) return stringClean(str.substring(2));
    return str.charAt(0) + stringClean(str.substring(1));
    }
}
