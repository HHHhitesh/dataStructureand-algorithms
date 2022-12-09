class Test3
{
	int sumOfNatural(int n)
	{
		if(n==0)
			return 0;
		return n+sumOfNatural(n-1);
	}
	public static void main(String[]args)
	{
		Test3 t=new Test3();
		int x=5;
		System.out.println(t.sumOfNatural(x));

	}
}