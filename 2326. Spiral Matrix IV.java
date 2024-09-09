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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr = new int[m][n];

        for(int [] it: arr) {
            Arrays.fill(it,-1);
        }

        int sc = 0, sr = 0, ec = n-1, er = m-1, count = 0, end = m*n-1;

        while(count <= end && head != null) {
            for(int i = sc ; count <= end && i <= ec ; i++) {
                if(head == null) continue;
                else {
                    arr[sr][i] = head.val;
                    head = head.next;
                }
                count++;
            }
            sr++;

            for(int i = sr ; count <= end && i <= er ; i++) {
                if(head == null) continue;
                else {
                    arr[i][ec] = head.val;
                    head = head.next;
                }
                count++;
            }
            ec--;

            for(int i = ec ; count <= end && i >= sc ; i--) {
                if(head == null) continue;
                else {
                    arr[er][i] = head.val;
                    head = head.next;
                }
                count++;
            }
            er--;

            for(int i = er ; count <= end && i >= sr ; i--) {
                if(head == null) continue;
                else {
                    arr[i][sc] = head.val;
                    head = head.next;
                }
                count++;
            }
            sc++;
        }
        return arr;
    }
}
