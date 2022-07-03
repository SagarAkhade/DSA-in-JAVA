package com.company.A_9_Trees;
//Q. Insert Node And Search Key in BST | Coding Interview Question

public class A_9_Tree_4_Insert_Node_And_Search_Key_In_Binary_Search_Tree {
    public TreeNode root;
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Insert Node in BST
    public void insert(int value){
        root = insert(root, value);
    }
    public TreeNode insert(TreeNode root, int value) {
        if(root == null) {  // Base Condition
             root = new TreeNode(value);
             return root;
        }
        if(value < root.data) {
            root.left = insert(root.left, value);
        }
        else{
            root.right = insert(root.right, value);
        }
        return root;
    }

    // Printing Node of BST
    public void inOrder(TreeNode root) {    //Output : left->root->right
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    //Search key in BST
    public TreeNode search(TreeNode root, int key){
        if(root == null || root.data == key){  //base Condition
            return root;
        }
        if(key < root.data) {
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        A_9_Tree_4_Insert_Node_And_Search_Key_In_Binary_Search_Tree bst = new A_9_Tree_4_Insert_Node_And_Search_Key_In_Binary_Search_Tree();
        bst.insert(5);  // inserting Nodes in BST
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);

        // When we print BST in inOder form then node will be in Sorted in O/p
        bst.inOrder(bst.root);
        System.out.println();
        //Output : 1 3 5 7

        //Search key in BST
        if(bst.search(bst.root, 5) != null) {
            System.out.println("Key Found !!!");
        }
        else{
            System.out.println("Key Not Found!!!");
        }
        // Output : Key Found !!!
    }
}
