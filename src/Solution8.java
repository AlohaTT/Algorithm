import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/*
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Solution8 {

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		Deque<TreeNode> deque = new LinkedList<>();
		deque.add(root);
		while (!deque.isEmpty()) {
			TreeNode p = deque.pop();
			list.add(p.val);
			if(p.left!=null) deque.add(p.left);
			if(p.right!=null) deque.add(p.right);
		}

		return list;
	}
}
