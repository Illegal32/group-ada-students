package az.coders.ada_students.lessons.lesson_14;
import java.util.*;
public class HackerRankString4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int i;
        int count = 0;
        for(i = s.charAt(0); i <= s.lastIndexOf(s);i++){
            count++;
            System.out.println(s.charAt(i));
            System.out.println(count);
        }
        scan.close();
    }
}