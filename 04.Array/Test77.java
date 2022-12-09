import java.util.Arrays;
class Test77
{
	public static void main(String[]args)
	{
		int[] arr={1,2,3,9,5,6};

		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}