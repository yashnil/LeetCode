/**
LeetCode #416. Partition Equal Subset Sum (EASY)

class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;

        for (int num: nums)
        {
            totalSum += num;
        }

        if (totalSum % 2 != 0)
        {
            return false;
        }

        int target = totalSum / 2;

        boolean[] dp = new boolean[target+1];
        // dp[k] -> possible to choose a subset of numbers so far that adds up to k

        dp[0] = true;

        for (int num: nums) 
        {
            for (int j = target; j >= num; j--)
            {
                dp[j] = dp[j] || dp[j - num]; 
                // if already possible to obtain j OR possible to obtain j-num, then true
            }

            if (dp[target])
            {
                return true;
            }
        }

        return dp[target];
    }
}
 */