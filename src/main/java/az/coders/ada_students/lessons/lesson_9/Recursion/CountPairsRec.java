package az.coders.ada_students.lessons.lesson_9.Recursion;

public class CountPairsRec {
    public static void main(String[] args) {
        System.out.println(countPairs("hihih"));
    }
    public static int countPairs(String str) {
        if(str.length() == 0 || str.length() < 3) return 0;
        if(str.charAt(0) == str.charAt(2)) return 1 + countPairs(str.substring(1));
        return countPairs(str.substring(1));
    }
}
