package az.coders.ada_students.lessons.lesson_9.Recursion;

public class NoXRec {
    public static void main(String[] args) {
        System.out.println(noX("xaxaxoxoxo"));
    }
    public static String noX(String str) {
        if(str.length() == 0) return str;
        if(str.charAt(0) == 'x')
            return noX(str.substring(1));
        return str.charAt(0) + noX(str.substring(1));
    }
}
