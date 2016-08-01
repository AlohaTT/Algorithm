import java.util.TreeSet;

/*
 * 现在有一个数组，请找出数组中每个元素的后面比它大的最小的元素，若不存在则为-1。
 * 给定一个int数组A及数组的大小n，请返回每个元素所求的值组成的数组。
 * 保证A中元素为正整数，且n小于等于1000。
 * 测试样例：
 * [11,13,10,5,12,21,3],7
 * [12,21,12,12,21,-1,-1]
 */
public class NextElement2 {
	public int[] findNext(int[] A, int n) {
		// write code here
		int[] B = new int[n];
		TreeSet<Object> treeSet = new TreeSet<>();
		
		for (int i = 0; i < B.length; i++)
			B[i] = -1;
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if(A[j]>A[i]){
					treeSet.add(A[j]);
				}
			}
			if(!treeSet.isEmpty()){
				B[i]=(int) treeSet.first();
			}
			treeSet.clear();
		}
		return B;
	}
}
