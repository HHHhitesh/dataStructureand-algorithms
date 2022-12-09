class Test10
{
	static void arrAddition(int arr[],int n)
	{
		int[] arrNew=new int[arr.length+1];
		for(int i=0;i<arrNew.length;i++)
		{
			if(i==arrNew.length-1)
			{
				arrNew[arrNew.length-1]=n;
			}
			else
			{
				arrNew[i]=arr[i];
			}
		}
		for(int j=0;j<arrNew.length;j++)
		{

		System.out.print(arrNew[j]+" ");
		}		
	}
	public static void main(String[]args)
	{
		int[] arr={1,2,3,4,5};
		int n=6;
		arrAddition(arr,n);
		
	}
}