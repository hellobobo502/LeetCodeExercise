package questions;

import tools.ListNode;

/**
 * 24.Swap Nodes in Pairs
 */
public class Q24 {

	public static void main(String[] args) {
		ListNode head = ListNode.createList(1,2,3,4,5,6,7);
		System.out.println(swapPairs(head));
	}
	
	public static ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null) return head;
		
		ListNode n = head.next;
		head.next = swapPairs(n.next);
		n.next = head;
		return n;
	}
}
