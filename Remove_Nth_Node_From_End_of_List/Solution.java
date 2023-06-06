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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Calculate the Length of the List
        int length=0;
        ListNode curr = head;
        while(curr!=null){
            curr = curr.next;
            length++;
        }
        
        //Assign Node prev=null & assign head Node to temp Node
        ListNode prev = null;
        ListNode temp = head;
        
        //Length-n+1 gives the position of the Node to be deleted
        for(int i=1 ; i<length-n+1;i++){
            prev = temp;
            temp = temp.next; 
        }
        //If only one node is present then head = head.next 
        //Else head = prev.next.next 
        if(prev==null){
            head = head.next;
        }
        else{
            prev.next = prev.next.next;
        }
        return head;
        
    }
}
