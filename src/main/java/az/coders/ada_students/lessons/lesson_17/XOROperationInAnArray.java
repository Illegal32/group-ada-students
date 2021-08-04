package az.coders.ada_students.lessons.lesson_17;

class Solution_new1 {
    public int xorOperation(int n, int start) {
        int ans=0;
        while(n!=0)
        {
            ans^=start;
            start+=2;
            n--;
        }
        return ans;
    }
}

public class XOROperationInAnArray {
    public static void main(String[] args) {
        Solution_new1 solutionNew1 = new Solution_new1();
        System.out.println(solutionNew1.xorOperation(5, 0));
    }
}