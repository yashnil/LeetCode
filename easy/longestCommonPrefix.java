package easy;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String longest = strs[0];
        for (int i=1; i<strs.length; i++)
        {
            int counter = 0;
            String common;
            while (counter < Math.min(longest.length(), strs[i].length()) && longest.charAt(counter) == strs[i].charAt(counter))
            {
                counter += 1;
            }
            common = longest.substring(0,counter);
            longest = common;
        }
        

        return longest;
    }
}