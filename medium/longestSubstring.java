import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int lowIndex = 0;
        int ans = 0;

        for (int highIndex = 0; highIndex < s.length(); highIndex++) {
            char character = s.charAt(highIndex);

            while (map.containsKey(character)) {
                map.remove(s.charAt(lowIndex));
                lowIndex ++;
            }

            map.put(character, 1);

            ans = Math.max(ans, highIndex - lowIndex + 1);
        }

        return ans;
    }
}