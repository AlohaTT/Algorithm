import java.util.TreeSet;

/*
 * ������һ�����飬���ҳ�������ÿ��Ԫ�صĺ�����������С��Ԫ�أ�����������Ϊ-1��
 * ����һ��int����A������Ĵ�Сn���뷵��ÿ��Ԫ�������ֵ��ɵ����顣
 * ��֤A��Ԫ��Ϊ����������nС�ڵ���1000��
 * ����������
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
