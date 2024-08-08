import java.util.*;
class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int value){
        this.value=value;
        left=right=null;

    }
}
public class postorderTraversal{
    public void postorder(TreeNode node){
        if(node==null)
        return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value+" ");


    } 

    public static void main(String[] args)
    {
    TreeNode root=new TreeNode(1);
    root.left=new TreeNode(2);
    root.right=new TreeNode(3);
    root.left.left= new TreeNode(4);
    root.left.right= new TreeNode(5);
    postorderTraversal tree=new postorderTraversal();
    System.out.print("Postorder traversal:");
    tree.postorder(root);

}

}