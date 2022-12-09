class Test01
{

	// static boolean presentX(int arr[],int x)
	// {	
	// 	for(int i=0;i<arr.length;i++)
	// 		if(arr[i]==x)
	// 			return i;
	// 	return -1;
	// }

	//insertLasr
	// static void insertLast(int arr[],int x)
	// {
	// 	int[] arrN=new int[arr.length+1];
	// 	for(int i=0;i<arr.length;i++)
	// 	{
	// 		arrN[i]=arr[i];
	// 	}
	// 	arrN[arr.length]=x;
	// 	print(arrN);

	// }
	// static void print(int arrN[])
	// {
	// 	for(int i=0;i<arrN.length;i++)
	// 	{
	// 		System.out.print(arrN[i]+" ");
	// 	}
	// }


	//insert index n
	// static void insertIndexN(int arr[],int x,int pos)
	// {
	// 	int[] arrN=new int[arr.length+1];
	// 	int index=pos-1;
	// 	for(int i=0;i<index;i++)
	// 	{
	// 		arrN[i]=arr[i];
	// 	}
	// 	arrN[index]=x;
	// 	for(int i=(index+1);i<arr.length+1;i++)
	// 	{
	// 		arrN[i]=arr[i-1];
	// 	}
	// 	print(arrN);

	// }


	//delete
	// static void deleteIndexN(int arr[],int pos)
	// {
	// 	int[] arrN=new int[arr.length-1];
	// 	int index=pos-1;
	// 	for(int i=0;i<index;i++)
	// 	{
	// 		arrN[i]=arr[i];
	// 	}
	// 	for(int i=index;i<arrN.length;i++)
	// 	{
	// 		arrN[i]=arr[i+1];
	// 	}
	// 	print(arrN);
	// }
	// static void print(int arrN[])
	// {
	// 	for(int i=0;i<arrN.length;i++)
	// 	{
	// 		System.out.print(arrN[i]+" ");
	// 	}
	// }



	// public static int greater(int arr[])
	// {
	// 	int res=0;
	// 	for(int i=1;i<arr.length;i++)
	// 		if(arr[i]>arr[res])
	// 			res=i;
	// 		return res;
	// }


	public static void reverse(int arr[])
	{
		int temp=0;
		for(int i=0;i<arr.length/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		printArray(arr);
	}
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[]args)
	{
		int[] arr={20,5,7,25};
	reverse(arr);

	}
}