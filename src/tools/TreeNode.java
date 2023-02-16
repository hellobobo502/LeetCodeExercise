package tools;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
	public int val;
    public TreeNode left;
    public TreeNode right;
    
	public TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}
    
	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public static TreeNode newTree(Integer[] array) {
		if(array.length == 0)
			return null;
		
		TreeNode root = new TreeNode(array[0]);
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		boolean isLeft = true;
		for(int i=1; i<array.length; i++) {
			TreeNode node = queue.peek();
			if(isLeft) {
				if(array[i] != null) {
					node.left = new TreeNode(array[i]);
					queue.offer(node.left);
				}
				isLeft = false;
			}else {
				if(array[i] != null) {
					node.right = new TreeNode(array[i]);
					queue.offer(node.right);
				}
				queue.poll();
				isLeft = true;
			}
		}
		return root;
	}
	
    @Override
	public String toString() {
		return "TreeNode{" + "val=" + val + ", left=" + left + ", right=" + right + '}';
	}
}
