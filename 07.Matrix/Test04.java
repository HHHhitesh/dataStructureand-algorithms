class Test04
{
	static void rotate90(int arr[][])
	{
		int temp[][]=new int[arr.length][arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				temp[arr.length-j-1][i]=arr[i][j];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=temp[i][j];
			}
		}
		print(arr);
	}
	static void print(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[]args)
	{
		int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotate90(arr);

	}	
}