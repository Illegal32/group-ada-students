package az.coders.ada_students.lessons.lesson_9.Recursion;

public class CountXRec {
    public static void main(String[] args) {
        System.out.println(countX("xkjhgfvcxzzzxxxxx"));
    }
    public static int countX(String str) {
        if(str.length() == 0) return 0;
        if(str.charAt(0) == 'x') return 1+countX(str.substring(1));
        else return countX(str.substring(1));
    }

}
