class Test66
{
	static void add(int arr[],int pos,int x)
	{
		int n=arr.length+1;
		int[] newArr=new int[n];
		for(int i=n-1;i>=(pos-1);i--)
		{
			newArr[i]=arr[i-1];
			if(i==(pos-1))
				{
					newArr[i]=x;
				}
		}
		for(int k=pos-2;k>=0;k--)
		{
			newArr[k]=arr[k];
		}
		for(int j=0;j<n;j++)
		{
			System.out.print(newArr[j] +" ");
		}
		


	}
	public static void main(String[]args)
	{
		int[] arr={1,2,3,4,5,6};
		int pos=6;
		int x=9;
		add(arr,pos,x);
	}
}