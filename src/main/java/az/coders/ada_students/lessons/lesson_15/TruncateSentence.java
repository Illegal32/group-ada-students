package az.coders.ada_students.lessons.lesson_15;


class Solution_18 {
    public static String truncateSentence(String s, int k) {
        String truncateSentence = "";
        int mesafe = 0;
        for (int i = 0; i <= s.length(); i++) {
            if ( s.charAt(i) == ' ' )
                mesafe++;

            if ( mesafe == k ) {
                break;
            } else {
                truncateSentence = truncateSentence + s.charAt(i);

            }
        }
        return truncateSentence.toString();
    }
}

public class TruncateSentence {
    public static void main(String[] args) {
        Solution_18 solution_18 = new Solution_18();
        String s = "Hello world and Hello everything";
        int k = 5;
        System.out.println(Solution_18.truncateSentence(s, k));
    }
}
