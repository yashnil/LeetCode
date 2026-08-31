/**
Leetcode #494. Target Sum (MEDIUM)

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int totalSum = 0;
        for (int num: nums)
        {
            totalSum += num;
        }

        if (Math.abs(target) > totalSum || (target + totalSum) % 2 != 0)
        {
            return 0;
        }

        int knapsack = (target + totalSum) / 2;

        int[] dp = new int[knapsack+1];

        dp[0] = 1;

        for (int num: nums)
        {
            for (int j = knapsack; j >= num; j --)
            {
                dp[j] = dp[j] + dp[j - num];
            } 
        }

        return dp[knapsack];
    }
}
 */