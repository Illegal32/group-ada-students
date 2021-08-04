package az.coders.ada_students.lessons.lesson_9.Recursion;

public class EndXRec {
    public static void main(String[] args) {
        System.out.println(endX("xxhellox"));
    }
    public static String endX(String str) {
        if( str.length() == 0 ) return str;
        if(str.charAt(0) == 'x') return endX(str.substring(1)) + 'x';
        return str.charAt(0)+ endX(str.substring(1));
    }
}
