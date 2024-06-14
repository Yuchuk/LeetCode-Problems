import javax.swing.tree.TreeNode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
            public int countNodes(TreeNode root) {
                rec(root);
                return counter;
            }

            private int counter;
            private void rec(TreeNode root){
                if(root == null){
                    return;
                }
                counter++;
                rec(root.left);
                rec(root.right);
            }
        }
    }
}