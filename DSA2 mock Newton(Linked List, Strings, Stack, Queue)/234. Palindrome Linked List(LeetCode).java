/*
234. Palindrome Linked List 
Link : https://leetcode.com/problems/palindrome-linked-list/
Given the head of a singly linked list, return true if it is a palindrome.
Input: head = [1,2,2,1]
Output: true
Input: head = [1,2]
Output: false
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null){
            return true;
        }
        
        Stack<Integer> stack = new Stack<>();
        ListNode current = head;
        while(current!=null){
            stack.push(current.val);
            current = current.next;
        }
        ListNode temp = head;
        while(temp!=null){
            if(temp.val!=stack.peek()){
                return false;
            }
            stack.pop();
            temp = temp.next;
        }
        return true;
    }
}

