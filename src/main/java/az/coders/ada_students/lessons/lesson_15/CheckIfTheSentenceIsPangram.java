package az.coders.ada_students.lessons.lesson_15;

class Solution_16 {
    public static boolean checkIfPangram(String sentence) {
//        for (int i = sentence.charAt(0); i < sentence.lastIndexOf(sentence); i++) {
//            for (int j = sentence.charAt(1); i < sentence.lastIndexOf(sentence); j++) {
//                if ( i == j ) return false;

        String alp = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i <alp.length(); i++) {
            String deyer = String.valueOf(alp.charAt(i));
            if ( !sentence.contains(deyer)) {
                return false;
            }
        }
        return true;
    }
}

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "leedcode";
        System.out.println(Solution_16.checkIfPangram(sentence));
    }
}
