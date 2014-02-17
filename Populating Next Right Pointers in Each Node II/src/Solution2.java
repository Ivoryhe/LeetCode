public class Solution2 {
    public void connect(TreeLinkNode root) {
        if(root == null) {return;}
        if(root.left != null){
            if(root.right != null){
                root.left.next = root.right;
            }
            else{
                root.left.next = findNext(root);
            }
        }
        
        if(root.right != null){
            root.right.next = findNext(root);
        }
        
        connect(root.right);
        connect(root.left);
    }
    
    public TreeLinkNode findNext(TreeLinkNode root){
        TreeLinkNode point = root.next;
        while(point != null){
            if(point.left == null && point.right == null){
                point = point.next;
            }
            else if(point.left != null){
                return point.left;
            }
            else{
                return point.right;
            }
        }
        return null;
    }
}