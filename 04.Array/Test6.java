// intertion and deletion in array
class Test6
{
	static int insert(int arr[],int n, int x,int capacity,int pos)
	{
		if(n==capacity)
			return n;
		int idx=pos-1;
		for(int i=n-1;i>=idx;i--)
		{
			arr[i+1]=arr[i];

		}
		arr[idx]=x;
		return (n+1);
	}

	public static void main(String[]args)
	{
		int[] arr={5,7,10,20};
		int n=arr.length;
		//insert x=3
		//pos = 2nd

		int capacity=arr.length+1;
		int pos=2;
		int x=3;
		System.out.println(insert(arr,n,x,capacity,pos));



	}
}