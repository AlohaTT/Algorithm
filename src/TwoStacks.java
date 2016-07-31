import java.util.ArrayList;
import java.util.Stack;

/*
 * ���дһ�����򣬰������ջ�������򣨼����Ԫ��λ��ջ������Ҫ�����ֻ��ʹ��һ�������ջ�����ʱ���ݣ�
 * �����ý�Ԫ�ظ��Ƶ�������ݽṹ�С�
 * ����һ��int[] numbers(C++��Ϊvector&ltint>)�����е�һ��Ԫ��Ϊջ�����뷵��������ջ��
 * ��ע������һ��ջ����ζ�������������ֻ�ܷ��ʵ���һ��Ԫ�ء�
 * ����������
 * [1,2,3,4,5]
 *  ���أ�[5,4,3,2,1]
 */
public class TwoStacks {
	public ArrayList<Integer> twoStacksSort(int[] numbers) {
		if (numbers == null || numbers.length < 1)
			return null;
		Stack<Integer> myStack1 = new Stack<Integer>();
		Stack<Integer> myStack2 = new Stack<Integer>();
		ArrayList<Integer> myResult = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			myStack1.push(numbers[i]);
		}
		while (!myStack1.empty()) {
			int myTemp = myStack1.pop();
			while (!myStack2.empty() && myStack2.peek() > myTemp) {
				myStack1.push(myStack2.pop());
			}
			myStack2.push(myTemp);
		}
		while (!myStack2.empty()) {
			myResult.add(myStack2.pop());
		}
		return myResult;
	}

}
