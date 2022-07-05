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
        ArrayList<Integer> numList = new ArrayList<Integer>();
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            numList.add(temp.val);
            temp = temp.next;
            len += 1;
        }
        
        for (int i = 0; i < len/2; i++){
            if(numList.get(i) != numList.get(len-1-i)){
                return false;
            }
        }

        
        return true;
    }
}