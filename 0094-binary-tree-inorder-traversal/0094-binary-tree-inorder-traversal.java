/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        inorder(root,result);
        return result;
    }
    private void inorder(TreeNode root,List<Integer> result){
        if(root==null) {
            return;
        }
        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);
    }
}