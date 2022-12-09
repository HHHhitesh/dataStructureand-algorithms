//Bubble sort
class Test04
{
	static void selectionSort(int arr[])
	{

		for(int i=0;i<arr.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
				int temp=arr[min];
			arr[min]=arr[j];
			arr[j]=temp;
			}

		}
	// static void bubbleSort(int arr[])
	// {
	// 	for(int i=0;i<arr.length-1;i++)
	// 	{
	// 		for(int j=0;j<arr.length-1-i;j++)
	// 		{
	// 			if(arr[j]>arr[j+1])
	// 			{
	// 				int temp=arr[j];
	// 				arr[j]=arr[j+1];
	// 				arr[j+1]=temp;
	// 			}
	// 		}
	// 	}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[]args)
	{
		int[] arr={1,2,3,4,5,6,7,8,9,0};
		selectionSort(arr);
	}
}