package com.company.A_9_Trees;
// Q. Check if Valid in BST | Coding Interview Question

public class A_9_Tree_5_Check_Valid_Binary_Search_Tree {
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

    //Check if Valid BST
    public boolean isValid(TreeNode root, long min, long max) {
        if(root == null) {
            return true;
        }
        if(root.data <= min || root.data >= max) {
            return false;
        }
        boolean left = isValid(root.left, min, root.data);
        if(left) {
            boolean right = isValid(root.right, root.data, max);
            return right;
        }
        return false;
    }


    public static void main(String[] args) {
        A_9_Tree_5_Check_Valid_Binary_Search_Tree bst = new A_9_Tree_5_Check_Valid_Binary_Search_Tree();
        bst.root = new TreeNode(5);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(6);
        TreeNode fourth = new TreeNode(1);
        TreeNode fifth = new TreeNode(4);
        bst.root.left = second;
        bst.root.right = third;
        second.left = fourth;
        second.right = fifth;

        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        if(bst.isValid(bst.root, min, max)) {
            System.out.println("The Given Tree is BST!!!");
        }
        else {
            System.out.println("The Given Tree is not BST!!!");
        }
        //Output : The Given Tree is BST!!!
    }
}
