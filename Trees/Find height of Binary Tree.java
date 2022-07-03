// "static void main" must be defined in a public class.
//Q. Height of Binary tree
public class Main {
    public TreeNode root; 
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public int heightOfTree(TreeNode root){
        if(root == null){
            return 0;
        }
        else{
            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);
            
            if(leftHeight > rightHeight){
                return (leftHeight + 1);
            }
            else{
                return (rightHeight + 1);
            }
        }
    }
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.left.right.left = new TreeNode(6);
        
        System.out.println("Height of Tree is : " + tree.heightOfTree(tree.root));
    }
}

//Output : Height of Tree is : 4
