package az.coders.ada_students.lessons.lesson_15;

class Solution_19 {
    public static String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for (int i = 1; i < s.length(); i+=2) {
            arr[i] += arr[i - 1] - '0';
        }
        return String.valueOf(arr);
    }
}

public class ReplaceAllDigitsWithCharacters {
    public static void main(String[] args) {
        Solution_19 solution_19 = new Solution_19();
        String s = "a1b1c1";
        System.out.println(Solution_19.replaceDigits(s));
    }
}
