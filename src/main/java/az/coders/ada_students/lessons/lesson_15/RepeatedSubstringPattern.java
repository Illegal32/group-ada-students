package az.coders.ada_students.lessons.lesson_15;

class Solution_21 {
    public static boolean repeatedSubstringPattern(String s) {
        String result = s.concat(s);
        result = result.substring(1,result.length()-1);
        return result.contains(s);
    }
}

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        Solution_21 solution_21 = new Solution_21();
        String s = "aba";
        System.out.println(Solution_21.repeatedSubstringPattern(s));
    }
}
