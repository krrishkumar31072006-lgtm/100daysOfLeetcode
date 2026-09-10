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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        ListNode prev = head;
        ListNode curr = head.next;
        
        int index = 1;
        int first = -1;
        int prevCritical = -1;
        int minDistance = Integer.MAX_VALUE;
        
        while (curr != null && curr.next != null) {
            
            boolean isMaxima = curr.val > prev.val && curr.val > curr.next.val;
            boolean isMinima = curr.val < prev.val && curr.val < curr.next.val;
            
            if (isMaxima || isMinima) {
                
                if (first == -1) {
                    first = index;
                } else {
                    minDistance = Math.min(
                        minDistance,
                        index - prevCritical
                    );
                }
                
                prevCritical = index;
            }
            
            prev = curr;
            curr = curr.next;
            index++;
        }
        
        if (first == -1 || first == prevCritical) {
            return new int[]{-1, -1};
        }
        
        int maxDistance = prevCritical - first;
        
        return new int[]{minDistance, maxDistance};
    }
}