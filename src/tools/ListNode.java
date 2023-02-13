package tools;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode() {}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	@Override
	public String toString() {
		return val + "->" + next;
	}
	
	public static ListNode createList(int... values) {
		if(values == null || values.length == 0)
			return null;
		
		ListNode head = new ListNode(values[0]);
		ListNode pos = head;
		
		for(int i=1; i<values.length; i++) {
			pos.next = new ListNode(values[i]);
			pos = pos.next;
		}
		
		return head;
	}
}
