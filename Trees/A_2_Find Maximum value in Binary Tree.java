package com.company.A_9_Trees;
// Q. Find the Maximum value in Binary Tree | Coding Interview Question

public class A_9_Binary_Tree_2_Find_Max_Value_In_Binary_Tree {
    public  TreeNode root;

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

    //Finding the Maximum value in Binary Tree
    public int findMaxInBT(TreeNode root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMaxInBT(root.left);
        int right = findMaxInBT(root.right);
        if(left > result) {
            result = left;
        }
        if(right > result) {
            result = right;
        }
        return result;
    }

    public static void main(String[] args) {
        A_9_Binary_Tree_2_Find_Max_Value_In_Binary_Tree bt = new A_9_Binary_Tree_2_Find_Max_Value_In_Binary_Tree();
        //Creating Binary tree
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(1);
        TreeNode third = new TreeNode(8);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(10);

        bt.root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;

        System.out.println("Maximum value in Binary Tree is : " + bt.findMaxInBT(bt.root));
        // Output :- Maximum value in Binary Tree is : 10
    }
}
