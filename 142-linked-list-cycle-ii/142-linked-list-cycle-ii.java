/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ArrayList<ListNode> nodeList = new ArrayList<ListNode>();
        if (head == null){
            return null;
        }
        ListNode temp = head;
        while(true){
            if(nodeList.contains(temp)){
                break;
            }
            if(temp.next == null){
                return null;
            }
            nodeList.add(temp);
            temp = temp.next;
        }
        return temp;
    }
}