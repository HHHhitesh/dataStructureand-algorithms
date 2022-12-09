class Test11
{
	static void newArray(int arr[],int add,int pos,int cap)
	{
		int newSize=arr.length+1;
		int[] arrNew=new int[newSize];
		// 0 1 2 3 4 5 6
		for(int i=newSize-1;i>=pos-1;i--)
		{
			if(i==pos-1)
			{
				arrNew[pos-1]=add;
			}
			arrNew[i]=arr[i-1];

		}
		for(int k=0;k<arrNew.length;k++)
		{
			System.out.println(arr[k]);
		}

	}
	public static void main(String[]args)
	{
		int[] arr={1,2,3,4,5,6};
		//add 7 to second position 
		// arrNew = {1,7,2,3,4,5,6};
		int add=7,pos=2,cap=7;
		newArray(arr,add,pos,cap);
	}
}