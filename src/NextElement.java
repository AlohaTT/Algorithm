/*
 * ����������һ��int���飬�����ҳ�������ÿ��Ԫ�ص���һ���������Ԫ�ء�
 * ����һ��int����A������Ĵ�Сn���뷵��һ��int���飬����ÿ��Ԫ�ر��������һ��Ԫ��,
 * ����������Ϊ-1����֤������Ԫ�ؾ�Ϊ��������
 * ����������
 * [11,13,10,5,12,21,3],7
 * ���أ�[13,21,12,12,21,-1,-1]
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
