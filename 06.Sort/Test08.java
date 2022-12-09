class Test08
{
	static void search(int arr[][],int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==x)
				{
					System.out.println("found at "+i+","+j+" ");
					return;
				}

			}
		}
		System.out.println("not found");
	}
	public static void main(String[]args)
	{
		int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
		int x=29;
		search(arr,x);

	}
}