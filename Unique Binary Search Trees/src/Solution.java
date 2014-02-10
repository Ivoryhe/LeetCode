/**
 * Feb-10-2014
 * @author Ivoryhe
 * Unique Binary Search Trees 
 * 
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 * 
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 * 
 */
public class Solution {
    public int numTrees(int n) {
        int result = 0;
        if(n<=1){
            return n;
        }

        for(int i=1; i<=n; i++){
            int left = numTrees(i-1);
            int right = numTrees(n-i);
            
            if(left == 0){
                result = result + right;
            }
            else if(right == 0){
                result = result + left;
            }
            else{
                result = result + left*right;
            }
        }
        
        return result;
        
    }
}