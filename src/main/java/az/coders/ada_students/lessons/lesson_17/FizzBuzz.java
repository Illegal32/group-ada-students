package az.coders.ada_students.lessons.lesson_17;

import java.util.Arrays;

class Solution_new3 {
    public String[] fizzBuzz(int n) {
        String [] count = new String[n];
        int i;
        for (i = 1; i <= n-1; i++) {
            if(i%3 == 0 && i%5==0){
                count[i] = "FizzBuzz";
            }
            else if(i%3 == 0){
                count[i] = "Fizz";
            }
            else if(i%5==0){
                count[i] = "Buzz";
            }
            else {
                count[i] = String.format("%s", i);
            }
        }
        return count;
    }
}

public class FizzBuzz {
    public static void main(String[] args) {
        Solution_new3 solutionNew3 = new Solution_new3();
        System.out.println(Arrays.toString(solutionNew3.fizzBuzz(15)));
    }
}
