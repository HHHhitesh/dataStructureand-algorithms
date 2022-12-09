class Test14
{
	static void leftRotateByOne(int arr[],int d)
	{
		for(int j=0;j<d;j++)
		{
			int temp=arr[0];
			for(int i=1;i<arr.length;i++)
			{
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=temp;
		}
		for(int p=0;p<arr.length;p++)
		{
			System.out.println(arr[p]);
		}
	}
	
	
	public static void main(String[]args)
	{
		int[] arr={1,2,3,4,5};
		int d=3;
		leftRotateByOne(arr,d);
	}
}