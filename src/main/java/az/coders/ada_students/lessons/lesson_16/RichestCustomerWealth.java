package az.coders.ada_students.lessons.lesson_16;

class Solution_23 {

    public int maximumWealth(int[][] accounts) {
        int sum = 0, max = 0;
        for(int [] i : accounts){
            for (int j : i){
                sum += j;
            }
            if ( max < sum )
                max = sum;
            sum = 0;
        }
        return max;
    }
}

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Solution_23 solution_23 = new Solution_23();
        System.out.println(solution_23.maximumWealth(new int[][]{{3,2,1}, {1,2,3}, {3,4,5}}));
    }
}
