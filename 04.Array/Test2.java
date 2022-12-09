class Test2
{
	static int searchArray(int arr[],int n,int x)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
				return 1;
		}
		return -1;
	}
	public static void main(String[]args)
	{
		int arr[]={20,5,7,25};
		int n=arr.length;
		int x=255;
		System.out.println(searchArray(arr,n,x));
	}
}