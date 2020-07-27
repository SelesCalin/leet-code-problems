package com.company;

import java.util.List;

/*

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head= new ListNode();
        ListNode currentNode= head;
        int carry=0;
        while (l1!=null && l2!=null) {
            int result=l1.val+l2.val+ carry;

            currentNode.next= new ListNode(result%10);
            carry= result/10;
            l1= l1.next;
            l2 =l2.next;
            currentNode=currentNode.next;

        }

        while (l1 != null) {
            int result = l1.val + carry;
            currentNode.next = new ListNode(result % 10);
            carry = result / 10;
            l1 = l1.next;
            currentNode = currentNode.next;
        }

        while (l2 !=null ) {
            int result = l2.val + carry;
            currentNode.next = new ListNode(result % 10);
            carry = result / 10;
            l2 = l2.next;
            currentNode = currentNode.next;
        }

        if (carry>0){
            currentNode.next= new ListNode(carry);

        }

        return head.next;

    }

}
