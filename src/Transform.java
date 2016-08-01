/*
 * 编写一个函数，确定需要改变几个位，才能将整数A转变成整数B。
 * 给定两个整数int A，int B。请返回需要改变的数位个数。
 * 测试样例：
 * 10,5
 * 返回：4
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
