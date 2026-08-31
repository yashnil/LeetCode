/**
LeetCode #70. Climbing Stairs (EASY)

class Solution {
    public int climbStairs(int n) {
        if (n <= 2)
        {
            return n;
        }

        int oneBack = 2; // two ways to reach 2
        int twoBack = 1; // one way to reach 1

        for (int i=3; i<=n; i++)
        {
            int current = oneBack + twoBack;
            twoBack = oneBack;
            oneBack = current;
        }

        return oneBack;
    }
}
 */