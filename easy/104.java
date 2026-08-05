/**
LeetCode #104. Maximum Depth of Binary Tree (EASY)

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
        {
            return 0;
        }
        return Math.max(maxDepth(root.right), maxDepth(root.left))+1;
    }
}
 */