
public class Remove {
	public boolean removeNode(ListNode pNode) {
        if (pNode.next==null) {
			return false;
		}
        pNode.val=pNode.next.val;
        pNode.next=pNode.next.next;
        return true;
    }
}
