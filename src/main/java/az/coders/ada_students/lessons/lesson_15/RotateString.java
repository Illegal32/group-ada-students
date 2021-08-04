package az.coders.ada_students.lessons.lesson_15;

class Solution_20 {
    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        s += s;
        return s.contains(goal);
    }
}

public class RotateString {
    public static void main(String[] args) {
        Solution_20 solution_20 = new Solution_20();
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(Solution_20.rotateString(s,goal));
    }
}
