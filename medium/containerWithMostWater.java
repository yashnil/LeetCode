class Solution {
    public int maxArea(int[] height) {
        
        int lowIndex = 0;
        int highIndex = height.length-1;
        int maxValue = 0;
        int lowHeight;

        while (lowIndex < highIndex)
        {
            lowHeight = Math.min(height[lowIndex],height[highIndex]);
            maxValue = Math.max(maxValue, (highIndex-lowIndex)*lowHeight);
            if (height[lowIndex] < height[highIndex])
            {
                lowIndex += 1;
            }
            else if (height[lowIndex] > height[highIndex])
            {
                highIndex -= 1;
            }
            else 
            {
                lowIndex += 1;
                highIndex -= 1;
            }
        }
        return maxValue;
    }
}