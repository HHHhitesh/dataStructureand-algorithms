//largest element in array
class Test3
{
	static int largest(int arr[])
	{
		int max=arr[0];
		int secondMax=arr[0];
		int x=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(x==arr[i])
			{
				return -1;
			}
			if(max<arr[i])
			{
				secondMax=max;
				max=arr[i];
			}
		}
		return secondMax;
	}
	public static void main(String[]args)
	{
		int[] arr={100,100,100};
		System.out.println(largest(arr));
	}
}