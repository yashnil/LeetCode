/**
LeetCode #103. Binary Tree Zigzg Level Order Traversal (MEDIUM)

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
        {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean leftToRight = true;

        while (!queue.isEmpty())
        {
            int levelSize = queue.size();

            LinkedList<Integer> currentLevel = new LinkedList<>();

            for (int i=0; i<levelSize; i++)
            {
                TreeNode current = queue.poll();

                if (leftToRight)
                {
                    currentLevel.addLast(current.val);
                }
                else
                {
                    currentLevel.addFirst(current.val);
                }

                if (current.left != null)
                {
                    queue.offer(current.left);
                }

                if (current.right != null)
                {
                    queue.offer(current.right);
                }
            }

            res.add(currentLevel);
            leftToRight = !leftToRight;
        }

        return res;

    }
}
 */