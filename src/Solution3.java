import java.util.ArrayList;
import java.util.Arrays;

/**
 * ��Ŀ����
 * ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�
 * ����С��4��������1,2,3,4,��
 */

/**
 * @author tony
 *
 */
public class Solution3 {
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Arrays.sort(input);
		if (k > input.length) {
			return result;
		} else {
			for (int i = 0; i < k; i++) {
				result.add(input[i]);
			}
			return result;
		}
	}
}
