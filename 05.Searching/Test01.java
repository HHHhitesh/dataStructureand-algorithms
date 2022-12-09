//Binary Search
class Test01
{
	// static int binarySearch(int arr[],int x)
	// {
	// 	for(int i=0;i<arr.length;i++)
	// 	{
	// 		if(arr[i]==x)
	// 		{
	// 			return i;
	// 		}
	// 	}
	// 	return -1;
	// }

	static int binarySearch(int arr[],int n,int x)
	{
		int low=0,high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]>x)
				high=mid-1;
			else
				low=mid+1;
		}
		return -1;


		// int low=0,high=n-1;
		// while(low<=high)
		// {
		// 	int mid=(low+high)/2;
		// 	if(arr[mid]==x)
		// 	{
		// 		return mid;
		// 	}
		// 	else if(arr[mid]>x)
		// 	{
		// 		high=mid-1;
		// 	}
		// 	else
		// 	{
		// 		low=mid+1;
		// 	}
		// }
		// return -1;
	}
	public static void main(String[]args)
	{
		int[] arr={10,20,30,40,50,60};
		int x=60;
		System.out.println(binarySearch(arr,arr.length,x));
	}
}