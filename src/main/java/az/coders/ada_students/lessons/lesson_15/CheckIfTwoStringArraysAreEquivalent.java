package az.coders.ada_students.lessons.lesson_15;

class Solution_10 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if ( word1 == word2 ) return true;
        String s1 = "";
        String s2 = "";
        for (String s : word1) {
            s1 = s1.concat(s);
        }
//        for (int i = 0; i < word1.length; i++) {
//            s1 = s1.concat(word1[i]);
//        }
        for (String s : word2) {
            s2 = s2.concat(s);
        }
//        for (int j = 0; j < word2.length; j++) {
//            s2 = s2.concat(word2[j]);
//        }
        return s1.equals(s2);
//        if ( s1.equals(s2) ) {
//            return true;
//        } else {
//            return false;
//        }

    }
}

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        Solution_10 solution_10 = new Solution_10();

        String [] word1 = {"ab", "c"};
        String [] word2 = {"a", "bc"};
        System.out.println(solution_10.arrayStringsAreEqual(word1,word2));
    }
}
