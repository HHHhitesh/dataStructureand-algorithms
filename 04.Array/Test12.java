class Test12
{
	static int swap(int x,int y)
	{
		int temp=x;
		x=y;
		y=temp;
		return x,y;
	}
	static void zeroToEnd(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				for(int j=i+1;j<n;j++)
				{
					if(arr[j]!=0)
					{
						swap(arr[i],arr[j]);
					}
				}
			}
		}
	}
	public static void main(String[]args)
	{
		int[] arr={10,5,0,0,8,0,9,0};
		//move 0 to end
		zeroToEnd(arr);
	}
}