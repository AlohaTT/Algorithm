import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */

/**
 * @author tony
 *
 */
public class Solution4 {

	public void reOrderArray(int[] array) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for (Integer num : array) {
			if (num%2==1) {
				list1.add(num);
			}else {
				list2.add(num);
			}
		}
		list1.addAll(list2);
		Object[] array2 = list1.toArray();
		for (int i = 0; i < array.length; i++) {
			array[i]=(int) array2[i];
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution4 solution4 = new Solution4();
		int[] array={3,2,5,1,2,8,11,23};
		solution4.reOrderArray(array);
		System.out.println(Arrays.toString(array));
	}

}
