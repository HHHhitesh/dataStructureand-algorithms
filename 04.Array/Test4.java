//array is sorted or not
class Test4
{
	static boolean sorted(int arr[])
	{
		int x=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(x<=arr[i])
			{
				x=arr[i];
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[]args)
	{
		int[] arr={100,20,200};
		System.out.println(sorted(arr));

	}
}