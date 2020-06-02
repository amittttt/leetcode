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
/**
 *  Invert Tree is also known as Binary Tree. 
 *  we are solving this problem using queue.
 *  Time Complexity : O(n)
 *  Space Complexity : O(n)
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if(root==null)
            return root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size()>0){
            TreeNode temp = queue.peek();
            queue.remove();
            TreeNode tempLeft = temp.left;
            temp.left = temp.right;
            temp.right = tempLeft;
            if(temp.left!=null)  queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
        }
        return root;
    }
}

// TODO: Solve this with recursion 