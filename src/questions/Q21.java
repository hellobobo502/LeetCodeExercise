package questions;

import tools.ListNode;

/**
 * 21.Merge Two Sorted Lists
 */
public class Q21 {
	public static void main(String[] args) {
		ListNode list1 = ListNode.createList();
		ListNode list2 = ListNode.createList(0);
		System.out.println(mergeTwoLists(list1, list2));
	}
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // step2
		if(list1 == null) return list2;
		if(list2 == null) return list1;
		
		// step1
		if(list1.val < list2.val) {
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		}else {
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}
    }
}
