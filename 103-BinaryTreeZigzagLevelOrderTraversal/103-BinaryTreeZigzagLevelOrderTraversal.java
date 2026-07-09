// Last updated: 7/9/2026, 3:10:49 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null){
            return ans;
        }
        q.add(root);
        int x =0;
        while (q.size() > 0){
            int m = q.size();
            List<Integer> temp = new ArrayList<>();
            for (int i=1; i<=m; i++){
                TreeNode curr = q.poll();
                if (x % 2 == 0) {
                    temp.add(curr.val);
                } else {
                    temp.addFirst(curr.val);
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null){
                    q.add(curr.right);
                }
            }
            ans.add(temp);
            x++;
        }
        return ans;
    }
}