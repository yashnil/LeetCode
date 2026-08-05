/**
LeetCode #5. Longest Palindromic Substring (MEDIUM)

class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            
            int len1 = expand(s, i, i); // odd length palindrome
            int len2 = expand(s, i, i+1); // even length palindrome
            
            int temp = Math.max(len1, len2);
            
            if (temp > maxLength) {
                maxLength = temp;
                start = i - (temp-1)/2;
            }
        }

        return s.substring(start, start + maxLength); 
    }
    private int expand(String s, int left, int right)
    {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left --;
            right ++;
        }

        return right-left-1;
    }
}
 */