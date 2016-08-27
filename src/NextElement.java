/*
 * 现在我们有一个int数组，请你找出数组中每个元素的下一个比它大的元素。
 * 给定一个int数组A及数组的大小n，请返回一个int数组，代表每个元素比他大的下一个元素,
 * 若不存在则为-1。保证数组中元素均为正整数。
 * 测试样例：
 * [11,13,10,5,12,21,3],7
 * 返回：[13,21,12,12,21,-1,-1]
 */
public class NextElement {
	public int[] findNext(int[] A, int n) {
        // write code here
		int[] B=new int[n];
		for(int i=0;i<B.length;i++)
			B[i]=-1;
		for (int i = 0; i < A.length; i++) {
			for (int j = i+1; j < A.length; j++) {
				if (A[i]<A[j]) {
					B[i]=A[j];
					break;
				}
			}
			
		}
		return B;
    }
}
