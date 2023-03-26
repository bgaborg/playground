package org.gabota.neetcode.slidingwindow;

public class e01BuyOrSellStock {

    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxprofit = 0;
        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                maxprofit = Math.max(maxprofit, prices[right] - prices[left]);
            } else {
                left=right;
            }
            right++;
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
    }
}