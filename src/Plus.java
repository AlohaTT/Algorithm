/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Plus {
	public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
    	ListNode p= a;
    	ListNode q=b;
    	int count=0;
    	while(a!=null){
    		if (p.val+q.val>9) {
				count=1;
			}else {
				count=0;
			}
    		p.val=(p.val+q.val)%10;
    	}
    	
    	return p;
    }
}