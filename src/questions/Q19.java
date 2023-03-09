package questions;

import tools.ListNode;

/**
 * 19.Remove Nth Node From End of List
 */
public class Q19 {
	public static void main(String[] args) {
		ListNode head = ListNode.createList(1,2,3,4,5);
		int n = 3;
		System.out.println(removeNthFromEnd(head, n));
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null) return head;
		
		ListNode slow = head;
		ListNode fast = head;
		
		for(int i=0; i<n; i++) {
			fast = fast.next;
		}
		if(fast == null) return head.next;
		
		while(fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		
		return head;
	}
}
