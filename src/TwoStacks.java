import java.util.ArrayList;
import java.util.Stack;

/*
 * 请编写一个程序，按升序对栈进行排序（即最大元素位于栈顶），要求最多只能使用一个额外的栈存放临时数据，
 * 但不得将元素复制到别的数据结构中。
 * 给定一个int[] numbers(C++中为vector&ltint>)，其中第一个元素为栈顶，请返回排序后的栈。
 * 请注意这是一个栈，意味着排序过程中你只能访问到第一个元素。
 * 测试样例：
 * [1,2,3,4,5]
 *  返回：[5,4,3,2,1]
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
