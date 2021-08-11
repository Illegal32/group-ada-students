package az.coders.ada_students.lessons.lesson_18;

class Solution18_2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if ( prices[i] - prices[i - 1] > 0 ) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        Solution18_2 solution18_2 = new Solution18_2();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(solution18_2.maxProfit(prices));
    }
}
