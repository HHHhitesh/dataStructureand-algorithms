class Test13
{
	static void leftRotateByOne(int arr[])
	{
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		for(int q=0;q<arr.length;q++)
		{
			System.out.print(arr[q]+" ");
		}
	}
	
	public static void main(String[]args)
	{
		int[] arr={1,2,3,4,5};
		leftRotateByOne(arr);
	}
}