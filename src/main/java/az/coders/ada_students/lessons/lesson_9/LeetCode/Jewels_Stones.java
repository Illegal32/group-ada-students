package az.coders.ada_students.lessons.lesson_9.LeetCode;

public class Jewels_Stones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aabb", "aback"));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        if(jewels.length() == 0 || stones.length() == 0) return 0;
        if(jewels.length() < stones.length()){
            if(jewels.charAt(0) == 0 && stones.charAt(0) == stones.charAt(1)) return 1 + numJewelsInStones(jewels.substring(1), stones.substring(1));
        }
        if(jewels.charAt(0) == stones.charAt(0)) return 1 + numJewelsInStones(jewels.substring(1), stones.substring(1));

        return numJewelsInStones(jewels.substring(1), stones.substring(1));
    }
}