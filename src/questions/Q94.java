package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import tools.TreeNode;

public class Q94 {

	public static void main(String[] args) {
		TreeNode root = TreeNode.newTree(new Integer[] {1,2,3,4,5,6,7,null,null,8,9,null,null,10,11});
		System.out.println(inorderTraversal(root));
	}

	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();

	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    TreeNode cur = root;

	    while(cur!=null || !stack.empty()){
	        while(cur!=null){
	            stack.add(cur);
	            cur = cur.left;
	        }
	        cur = stack.pop();
	        list.add(cur.val);
	        cur = cur.right;
	    }

	    return list;
    }
}
