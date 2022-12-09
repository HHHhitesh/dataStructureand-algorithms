//merge sort
class Test05
{
	static void mergeSort(int arr1[],int arr2[])
	{
		int y=arr1.length+arr2.length;
		int[] newArr=new int[y];
		bubbleSort(arr1);
		bubbleSort(arr2);
		for(int i=0;i<y;i++)
		{
			if(i<arr1.length)
			{
				newArr[i]=arr1[i];
			}
			else
			{
				newArr[i]=arr2[i-arr1.length];	
			}
		}
		bubbleSort(newArr);
		printDisplay(newArr);
	}
	static void printDisplay(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	static void bubbleSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[]args)
	{
		int[] arr1={9,99,5,0};
		int[] arr2={0,4,8,2,1};
		mergeSort(arr1,arr2);

	}
}