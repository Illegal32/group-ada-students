package az.coders.ada_students.lessons.lesson_9.LeetCode;

public class PolindromeLeetCode {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }
    public static boolean isPalindrome(int x) {
//        int y = 1, sum = 0, a, count = 0;
//        a = x;
//        if (x > 0) {
//            count++;
//            y = x % 10;
//            System.out.println(y);
//            sum = (int) ((sum * Math.pow(10, count)) + y);
//            System.out.println(sum);
//            x = x / 10;
//          System.out.println(x);
//        }
//
//            if(a == sum){
//                return true;
//            }
//            else {
//                return false;
//            }
        int count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
            System.out.println(count);
        }

        return false;
    }
}
