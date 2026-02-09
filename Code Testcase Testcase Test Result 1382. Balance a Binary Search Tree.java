class Solution {

    public void inorder(TreeNode root,ArrayList<Integer> res){
        if(root!=null){
            inorder(root.left,res);
            res.add(root.val);
            inorder(root.right,res);
        }
    }

    public TreeNode build(ArrayList<Integer> res,int l,int r){
        if(l>r){
            return null;
        }
        int mid = l+(r-l)/2;
        TreeNode node = new TreeNode(res.get(mid));
        node.left = build(res,l,mid-1);
        node.right = build(res,mid+1,r);
        return node;

    } 

    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> res =  new ArrayList<>();
        inorder(root,res);
        return build(res,0,res.size()-1);
    }
}
