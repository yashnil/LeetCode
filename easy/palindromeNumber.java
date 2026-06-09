package easy;
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x != 0 && x % 10 == 0) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}
/*
class Solution {
    public boolean isPalindrome(int x) {

        int counter = 0;
        String str = Integer.toString(x);

        int l = str.length() / 2;

        boolean temp = true;

        while (counter < l)
        {
            if (str.charAt(counter) != str.charAt(str.length()-1-counter))
            {
                temp = false;
            }
            counter += 1;
        }
        return temp;
    }
}
*/