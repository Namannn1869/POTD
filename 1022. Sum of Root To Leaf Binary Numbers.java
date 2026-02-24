class Solution {
    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,sum);
    }

    public static int dfs(TreeNode root,int sum){
        if(root==null){
            return 0;
        }

        sum = (sum<<1) + root.val;

        if(root.left==null && root.right==null){
            return sum;
        }

        return dfs(root.left,sum)+dfs(root.right,sum);
    }
}
