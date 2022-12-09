//reverse an array
class Test5
{
	static void reverse(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[n-1-i]+" ");
		}
	}
	public static void main(String[]args)
	{
		int[] arr={10,5,7,30};
		reverse(arr);
	}
}