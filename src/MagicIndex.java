/*
 * 在数组A[0..n-1]中，有所谓的魔术索引，满足条件A[i]=i。给定一个升序数组，
 * 元素值各不相同，编写一个方法，判断在数组A中是否存在魔术索引。请思考一种
 * 复杂度优于o(n)的方法。给定一个int数组A和int n代表数组大小，请返回一个
 * bool，代表是否存在魔术索引。测试样例：
 * [1,2,3,4,5]
 * 返回：false
 */
public class MagicIndex {
	public boolean findMagicIndex(int[] A, int n) {
		// write code here
		return find(A,0,n-1);
	}

	private boolean find(int[] A, int begin,int end) {
		if(begin>end)
			return false;
		int index=(begin+end)/2;
		if(A[index]==index)
			return true;
		if(index>A[index])
			return find(A,index+1,end);
		else
			return find(A,begin,index-1);
	}
}
