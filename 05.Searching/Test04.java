class Test04
{
	static boolean twoPointersApproach(int arr[],int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(x==(arr[i]+arr[j]))
					return true;
			}
		}
		return false;
	}
	public static void main(String[]args)
	{
		int[] arr={3,8,13,18};
		int x=14;
		System.out.println(twoPointersApproach(arr,x));

	}
}