/*
 * ��дһ��������ȷ����Ҫ�ı伸��λ�����ܽ�����Aת�������B��
 * ������������int A��int B���뷵����Ҫ�ı����λ������
 * ����������
 * 10,5
 * ���أ�4
 */
public class Transform {
	public int calcCost(int A, int B) {
		int a=A^B;
        int count=0;
        while(a!=0){
            if((a&1)==1){
                count++;
            }
            a>>>=1;
        }
        return count;
    }
	public static void main(String[] args) {
		Transform tf = new Transform();
		System.out.println(tf.calcCost(10, 5));
	}
}
