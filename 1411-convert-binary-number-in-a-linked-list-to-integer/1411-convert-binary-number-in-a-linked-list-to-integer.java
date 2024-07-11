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
    public int getDecimalValue(ListNode head) {
        ListNode traverse = head;
        int size = 0;
        while(traverse != null){
            size++;
            traverse = traverse.next;
        }
        int ans = 0;
        size = size - 1;
        while(head != null){
            int digit = head.val;
            ans = ans + (digit * (int)Math.pow(2, size));
            size--;
            head = head.next;
        }
        return ans;
    }
}