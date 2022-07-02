package com.company.A_9_Binary_Tree;
import java.util.*;

//This program is for Implementing the Binary Tree
public class A_9_Binary_Tree_1_Implementing_Binary_Tree {
    public TreeNode root;    // Creating Instance Variable for BinaryTree

    public class TreeNode{  // Creating Inner class for Binary Tree
        int data;  //any generic type
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){  // This is constructor for Binary Tree
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public void createBinaryTree(){  //Creating Binary Tree
        TreeNode first = new TreeNode(9);   //Creating nodes for Creating Binary Tree
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);

        root = first;  // root --> first
        first.left = second;
        first.right=  third;  // second <-- first --> third

        second.left = fourth;
    }

    public void createBinaryTreeForLevelOrder(){  //Creating Binary Tree
        TreeNode first = new TreeNode(1);   //Creating nodes for Creating Binary Tree
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;  // root --> first
        first.left = second;
        first.right=  third;  // second <-- first --> third

        second.left = fourth;
        second.right = fifth;

        third.left = sixth;
        third.right = seventh;
    }

    //PreOrder traversal(Recursive) of Binary Tree --> Output : root-left-right
    public void preOrderRecursive(TreeNode root){
        if(root==null){  //Base Condition
            return;
        }
        System.out.print(root.data + " ");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    //PreOrder traversal(Iterative) of Binary Tree --> Output : root-left-right
    public void preOrderIterative(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();  // LIFO
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }

    //InOrder traversal(Recursive) of Binary Tree --> Output : left-root-right
    public void inOrderRecursive(TreeNode root) {
        if(root == null) {   // Base Condition for Recursion
            return;
        }
        inOrderRecursive(root.left);
        System.out.print(root.data + " ");
        inOrderRecursive(root.right);
    }

    //InOrder traversal(Iterative) of Binary Tree --> Output : left-root-right
    public void inOrderIterative(TreeNode root) {
        if(root == null) {    // Base Condition for Recursion
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null) {
            if(temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            else{
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    //PostOrder traversal(Recursive) of Binary Tree --> Output : left-right-root
    public void postOrderRecursive(TreeNode root) {
        if(root == null) {  //base condition
            return;
        }
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.data + " ");
    }

    //PostOrder traversal(Iterative) of Binary Tree --> Output : left-right-root
    public void postOrderIterative(TreeNode root) {
        if(root == null) {
            return;
        }
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while(current != null || !stack.isEmpty()) {
            if(current != null){
                stack.push(current);
                current = current.left;
            }
            else{
                TreeNode temp = stack.peek().right;
                if(temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while(!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                }
                else{
                    current = temp;
                }
            }
        }
    }

    //Level Order traversal of Binary Tree --> Output : level 0->1->2
    public void levelOrder(TreeNode root ) {
        if(root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null) {
                queue.add(temp.left);
            }
            if(temp.right != null) {
                queue.add(temp.right);
            }
        }
    }


    public static void main(String[] args) {
        A_9_Binary_Tree_1_Implementing_Binary_Tree bt = new A_9_Binary_Tree_1_Implementing_Binary_Tree();
        bt.createBinaryTree(); // creating Binary Tree

        // PreOrder Traversal of Binary Tree(Recursive)
        System.out.print("PreOrder traversal using recursion : ");
        bt.preOrderRecursive(bt.root);
        System.out.println();
        //Output : PreOrder traversal using recursion : 9 2 4 3

        // PreOrder Traversal of Binary Tree(Iterative)
        System.out.print("PreOrder traversal using Iteration : ");
        bt.preOrderIterative(bt.root);
        System.out.println();
        //Output : PreOrder traversal using Iteration : 9 2 4 3

        // InOrder Traversal of Binary Tree(Recursive)
        System.out.print("InOrder traversal using Recursion : ");
        bt.inOrderRecursive(bt.root);
        System.out.println();
        //Output : InOrder traversal using Recursion : 4 2 9 3

        // InOrder Traversal of Binary Tree(Iterative)
        System.out.print("InOrder traversal using Iteration : ");
        bt.inOrderIterative(bt.root);
        System.out.println();
        //Output : InOrder traversal using Iteration : 4 2 9 3

        // PostOrder Traversal of Binary Tree(Recursive)
        System.out.print("PostOrder traversal using Recursion : ");
        bt.postOrderRecursive(bt.root);
        System.out.println();
        //Output : PostOrder traversal using Recursion : 4 2 3 9

        // PostOrder Traversal of Binary Tree(Iterative)
        System.out.print("PostOrder traversal using Iteration : ");
        bt.postOrderIterative(bt.root);
        System.out.println();
        //Output : PostOrder traversal using Iteration : 4 2 3 9

        // Level Order Traversal of Binary Tree
        bt.createBinaryTreeForLevelOrder();
        System.out.print("Level Order traversal using Iteration : ");
        bt.levelOrder(bt.root);
        System.out.println();
        //Output : Level Order traversal using Iteration : 1 2 3 4 5 6 7
    }
}
