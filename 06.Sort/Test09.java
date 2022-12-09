//medians of rowwise sorted matrin
import java.util.Arrays;
class Test09
{
	static int meadians(int arr[][])
	{
		int n=countArray(arr);
		int[] newArr=new int[n];
		for(int i=0;i<newArr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				for(int k=0;k<arr[j].length;j++)
				{
					arr[i]=arr[j][k];
				}
			}
		}
		Arrays.sort(newArr);
		int x=(n/2)+1;
		return newArr[x-1];
	}
	static int countArray(int arr[][])
	{
		int x=0;
		for(int i=0;i<arr.length;i++)
		{
			x=x+arr[i].length;
		}
		return x;
	}
	public static void main(String[]args)
	{
		int arr[][]={{1,10,20},{15,25,35},{5,30,40}};
		System.out.println(meadians(arr));
	}
}