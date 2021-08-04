package az.coders.ada_students.lessons.lesson_9.Recursion;

public class Count11Rec {
    public static void main(String[] args) {
        System.out.println(count11("11satr11"));
    }
    public static int count11(String str) {

        if ( str.length() == 0 || str.length() <= 1 )
            return 0;
        //int count = 0;
        if ( str.substring(0, 2).equals("11"))
            //count++;
            return 1 + count11(str.substring(2));
        return count11(str.substring(1));
    }
}
