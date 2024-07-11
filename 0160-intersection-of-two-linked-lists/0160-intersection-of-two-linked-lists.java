/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    int calculateSize(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeOf01 = calculateSize(headA);
            int sizeOf02 = calculateSize(headB);
            int moveBy;
            ListNode fast, slow;
            if(sizeOf01 > sizeOf02){
                moveBy = sizeOf01 - sizeOf02;
                fast = headA;
                slow = headB;
            }
            else{
                moveBy = sizeOf02 - sizeOf01;
                fast = headB;
                slow = headA;
            }
            for(int i = 1; i <= moveBy; i++){
                fast = fast.next;
            }
            while(fast != null){
                if(fast == slow){
                    return slow;
                }
                fast = fast.next;
                slow = slow.next;
            }
            return null;
    }
}