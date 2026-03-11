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
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head;
        

        while(temp!=null){
            al.add(temp.val);
            temp = temp.next;
        } 
        temp = head;
        for(int i=0; i<al.size(); i+=2){
            
                temp.val = al.get(i);
                temp = temp.next;
            
        }
        for(int i=1; i<al.size(); i+=2){
            
                temp.val = al.get(i);
                temp = temp.next;
            
        }
        return head;
        
    }
}