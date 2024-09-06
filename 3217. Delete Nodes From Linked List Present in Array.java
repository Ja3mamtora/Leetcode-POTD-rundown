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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        HashSet<Integer>st = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++) {
            st.add(nums[i]);
        }

        while(curr != null) {
            if(st.contains(curr.val)) {
                if(prev == null) {
                    head = curr.next;
                    curr = head;
                }
                else {
                    prev.next = curr.next;
                    curr = curr.next;
                }
            }
            else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }

}
