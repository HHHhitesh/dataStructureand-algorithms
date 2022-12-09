class Test7
{
	static  void removeDup(int arr[],int n)
	{
		int[] temp=new int[arr.length];
		int first=arr[0];	
		for(int i=1;i<arr.length;i++)
		{
			if(first!=arr[i])
			{
				for(int j=0;j<temp.length;j++)
				{
					temp[j]=first;
				}
				first=arr[i];
			}
		}
		for(int k=0;k<temp.length;k++)
		{
			System.out.println(temp[k]);
		}



	}
	// {
	// 	int res=1;
	// 	for(int i=1;i<n;i++)
	// 	{
	// 		if(arr[i]!=arr[res-1])
	// 		{
	// 			arr[res]=arr[i];
	// 			res++;
	// 		}
	// 	}
	// 	return res;
	// }
	public static void main(String[]args)
	{
		int[] arr={10,20,20,30,30,30,30};
		int n=arr.length;
		removeDup(arr,n);

	}
}