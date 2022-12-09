//one odd occuring number
class Test5
{
	int oneOddOccure(int arr[],int n)
	{
		for(int i=0;i<=n;i++)
		{
			int count=0;
			for(int j=0;j<=n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				if(count%2!=0)
				{
					return arr[i];
				}

			}	
		}	
	}
	public static void main(String[]args)
	{
		Test5 t=new Test5();
		int arr[]={7,3,7,7,7};
		int n=arr.length();
		System.out.println(OddOccure(arr,n));
	}
}