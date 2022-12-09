import java.util.*;
class Test06
{
	static int getMinDiff(int arr[])
	{
		Arrays.sort(arr);
		int res=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			res=Math.max(res,arr[i]-arr[i-1]);
		}
		return res;
	}
	public static void main(String[]args)
	{
		int[] arr={1,8,12,5,18};
		System.out.println(getMinDiff(arr));
	}
}