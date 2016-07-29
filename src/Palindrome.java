import java.util.Stack;

public class Palindrome {
    public boolean isPalindrome(ListNode pHead){
        ListNode fast = pHead;
        ListNode slow = pHead;
        Stack<Integer> stack = new Stack<Integer>();
        /**
         * �������ǰ�벿��Ԫ��װ��ջ�У�������runner
                 *���ƶ����ٶ�������runner��������
         * ��������β��ʱ��������runner�Ѿ����������м�λ��
         */
        while(fast != null && fast.next != null){
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        //������Ϊ������ʱ�������м�Ԫ��
        if (fast != null) {
            slow = slow.next;
        }
        while(slow != null){
            //������߲���ͬ����������ǻ��Ĵ�
            if (stack.pop() != slow.val) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}