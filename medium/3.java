/**
LeetCode #3. Longest Substring Without Repeating Characters (MEDIUM)

Solution 1:
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int ans = 0;
        int left = 0;

        for (int right=0; right<n; right++)
        {
            char c = s.charAt(right);
            if (map.containsKey(c))
            {
                left = Math.max(left, map.get(c)+1);
            }
            map.put(c,right);
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }

    
}

Solution 2: 
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int maxLength = 0;

        int[] lastSeen = new int[128];

        Arrays.fill(lastSeen, -1);

        int left = 0;
        for (int right = 0; right < n; right ++)
        {

            char current = s.charAt(right);

            if (lastSeen[current] >= left)
            {
                left = lastSeen[current] + 1;
            }
            
            lastSeen[current] = right;

            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

    
}
 */