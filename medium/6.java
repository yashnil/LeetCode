/**
LeetCode #6. Zigzag Conversion (MEDIUM)

import java.util.*;
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder ans = new StringBuilder();
        int cycle = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {
            int i = row;

            while (i < s.length()) {
                ans.append(s.charAt(i));

                int secondIndex = i + cycle - 2 * row;

                if (row != 0 && row != numRows - 1 && secondIndex < s.length()) {
                    ans.append(s.charAt(secondIndex));
                }

                i += cycle;
            }
        }

        return ans.toString();
    }
}
 */