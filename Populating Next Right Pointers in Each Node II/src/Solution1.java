import java.util.LinkedList;
/**
 * Feb-16-2014
 * @author Ivoryhe
 * Populating Next Right Pointers in Each Node II 
 * 
 * Follow up for problem "Populating Next Right Pointers in Each Node".
 * What if the given tree could be any binary tree? 
 * Would your previous solution still work?
 * Note:
 * You may only use constant extra space.
 * For example,
 * Given the following binary tree,
 *          1
 *        /  \
 *       2    3
 *      / \    \
 *     4   5    7
 * After calling your function, the tree should look like:
 *         1 -> NULL
 *        /  \
 *       2 -> 3 -> NULL
 *      / \    \
 *     4-> 5 -> 7 -> NULL
 */
public class Solution1 {
    public void connect(TreeLinkNode root) {
        if(root == null) {return;}
        LinkedList<TreeLinkNode> q1 = new LinkedList<TreeLinkNode>();
        LinkedList<TreeLinkNode> q2 = new LinkedList<TreeLinkNode>();
        root.next = null;
        q1.add(root);
        
        while(q1.size() != 0){
            TreeLinkNode node = q1.removeFirst();
            if(node.left != null){
                q2.add(node.left);
            }
            if(node.right != null){
                q2.add(node.right);
            }
            
            if(q1.size() == 0){
                q1 = q2;
                for(int i=0; i<q2.size()-1; i++){
                    q2.get(i).next = q2.get(i+1);
                }
                if(q2.size() != 0){
                    q2.get(q2.size()-1).next = null;
                }
                q2 = new LinkedList<TreeLinkNode>();
            }
        }
    }
}