//print 5 to 1
class Test1
{
	// int min(int n)
	// {
	// 	if(n==0)
	// {		return 0;
	// }
	// 	System.out.println(n);
	// 	return min(n-1);
	// }

	void min(int n)
	{
		if(n==0)
	{		return;
	}
		min(n-1);
		System.out.println(n);
		
	}
	public static void main(String[]args)
	{
		Test1 t=new Test1();
		t.min(10);
	}
}