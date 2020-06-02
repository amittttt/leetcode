/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
class Solution {
    public void deleteNode(ListNode node) {
       if(node.next!=null){
           node.val = node.next.val;
           node.next = node.next.next;
       }
    }
}