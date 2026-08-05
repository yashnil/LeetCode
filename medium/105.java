/**
LeetCode #105. Construct Binary Tree from Preorder and Inorder Traversal (MEDIUM)

class Solution {
    int current = 0;
    Map<Integer, Integer> inMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++)
        {
            inMap.put(inorder[i], i);
        }

        return helper(preorder, 0, inorder.length-1);
    }

    private TreeNode helper(int[] preorder, int left, int right) {
        if (left > right)
        {
            return null;
        }
            
        TreeNode root = new TreeNode(preorder[current++]);
        int mid = inMap.get(root.val);

        root.left = helper(preorder, left, mid-1);
        root.right = helper(preorder, mid+1, right);

        return root;
    }
}
 */