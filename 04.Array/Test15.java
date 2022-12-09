class Test15
{
	static void leader(int arr[])
	{
		int curr_lead=arr[arr.length-1];
		System.out.print(curr_lead+" ");
		for(int i=arr.length-2;i>=0;i--)
		{
			if(curr_lead<arr[i])
			{
				curr_lead=arr[i];
				System.out.print(curr_lead+" ");
			}
		}
	}
	public static void main(String[]args)
	{
		int[] arr={7,10,4,3,6,5,2};
		leader(arr);
	}
}















































// int curr_lead=arr[arr.length-1];
// 		System.out.print(curr_lead+" ");
// 		for(int i=arr.length-1;i>=0;i--)
// 		{
// 			if(curr_lead<arr[i])
// 			{
// 				curr_lead=arr[i];
// 				System.out.print(curr_lead+" ");
// 			}
// 		}