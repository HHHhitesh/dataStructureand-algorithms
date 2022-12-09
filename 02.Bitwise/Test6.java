//one odd occuring number
class Test6
{	
	int oddOccure(int arr[])
	{
		int res=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			res=res^arr[i];
		}
		return res;
	}

	public static void main(String[]args)
	{
		Test6 t=new Test6();
		int arr[]={4,4,7,4,8,7,7,7,8};
		System.out.println(t.oddOccure(arr));
	}	
}