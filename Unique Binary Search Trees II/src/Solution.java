import java.util.ArrayList;
/**
 * Mar-4-2014
 * @author Ivoryhe
 * Unique Binary Search Trees II
 * 
 * Given n, generate all structurally unique BST's (binary search trees) 
 * that store values 1...n.
 * 
 * For example,
 * Given n = 3, your program should return all 5 unique BST's shown below.
 * 
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * 
 * OJ's Binary Tree Serialization:
 * The serialization of a binary tree follows a level order traversal, 
 * where '#' signifies a path terminator where no node exists below.
 * 
 * Here's an example:
 *    1
 *   / \
 *  2   3
 *     /
 *    4
 *     \
 *      5
 * The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}"
 */
public class Solution {
	public ArrayList<TreeNode> generateTrees(int n) {
        ArrayList<TreeNode> result = helper(1,n);
        return result;
    }
    
    public ArrayList<TreeNode> helper(int a, int b){
        ArrayList<TreeNode> result = new ArrayList<TreeNode>();
        if(a>b){
            result.add(null);
            return result;
        }
        
        if(a==b){
            result.add(new TreeNode(a));
            return result;
        }
        
        for(int i=a; i<=b; i++){
            ArrayList<TreeNode> left = helper(a, i-1);
            ArrayList<TreeNode> right = helper(i+1, b);
            for(int x=0; x<right.size(); x++){
                for(int y=0; y<left.size(); y++){
                    TreeNode temp = new TreeNode(i);
                    temp.left = left.get(y);
                    temp.right = right.get(x);
                    result.add(temp);
                }
            }
        }
        return result;
    }
}
