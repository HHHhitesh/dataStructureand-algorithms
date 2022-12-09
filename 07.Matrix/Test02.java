//print boundry element // 1 2 3 4 8 12 16 15 14 13 9 5
class Test02
{
	static void boundryElement(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				// if(i/j==0||i/j==(arr.length-1))&&(j==ar)
				if(i==0||j==(arr.length-1))
				{
					System.out.print(arr[i][j]+" ");
				}
				if(((i==(arr.length-1)&&j<(arr.length-1))||((j==0)&&((i>0)&&(i<arr.legth-1))))
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
	public static void main(String[]args)
	{
		int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		boundryElement(arr);
	}	
}


/*
	 1  2  3  4
	 5  6  7  8 
	 9 10 11 12
	13 14 15 16
*/
