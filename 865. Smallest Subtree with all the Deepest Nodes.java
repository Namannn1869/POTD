class Solution {
    int maxDepth = 0;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        findDepth(root, 0);
        return findSubtree(root, 0);
    }

    public void findDepth(TreeNode node, int depth) {
        if (node == null) return;

        maxDepth = Math.max(maxDepth, depth);

        findDepth(node.left, depth + 1);
        findDepth(node.right, depth + 1);
    }

    public TreeNode findSubtree(TreeNode node, int depth) {
        if (node == null) return null;

        if (depth == maxDepth) return node;

        TreeNode left = findSubtree(node.left, depth + 1);
        TreeNode right = findSubtree(node.right, depth + 1);

        if (left != null && right != null) return node;

        return left != null ? left : right;
    }
}
