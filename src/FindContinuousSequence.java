/*
 * С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
 * ���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
 * û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22�����ڰ����⽻����,
 * ���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck! 
 * �������:
 * ������к�ΪS�������������С������ڰ��մ�С�����˳��
 * ���м䰴�տ�ʼ���ִ�С�����˳��
 */
import java.util.ArrayList;



public class FindContinuousSequence {
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
		if(sum<2)
			return arrayList;
		
		for(int i=1;i<=sum/2+2;i++){
			ArrayList<Integer> list = new ArrayList<>();
			int temp=0;
			for(int j=i;j<=sum/2+2;j++)
			{
				if(temp==sum){
					arrayList.add(list);
					break;
				}
				else if(temp>sum){
					list.clear();
					break;
				}
				else{
					temp=temp+j;
					list.add(j);
				}
					
			}
		}
		return arrayList;
	}
	public static void main(String[] args) {
		FindContinuousSequence findContinuousSequence = new FindContinuousSequence();
		findContinuousSequence.FindContinuousSequence(9);
	}
}
