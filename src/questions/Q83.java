package questions;

import tools.ListNode;

/**
 * 83.Remove Duplicates from Sorted List
 */
public class Q83 {
	public static void main(String[] args) {
		// 1
		// 1,1
		// 1,1,2
		// 1,2,3,3,4,5,6
		ListNode head = ListNode.createList(1,1,2,3,3,4,5,6,7,7,7,7,9,9,9,10);
		System.out.println(deleteDuplicates(head));
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) 
			return head;
		
		head.next = deleteDuplicates(head.next);
		return head.val == head.next.val ? head.next : head;
    }
}
