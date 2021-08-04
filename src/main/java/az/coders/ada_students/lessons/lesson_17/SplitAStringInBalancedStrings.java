package az.coders.ada_students.lessons.lesson_17;

class Solution_new {
    public int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;

        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) == 'R' ) {
                balance++;
            } else {
                balance--;
            }

            if ( balance == 0 ) {
                count++;
            }
        }
        return count;
    }
}

public class SplitAStringInBalancedStrings {
    public static void main(String[] args) {
        Solution_new solutionNew = new Solution_new();
        String s = "RLRRLLRLRL";
        System.out.println(solutionNew.balancedStringSplit(s));
    }
}