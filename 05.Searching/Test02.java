class Test02
{
	static int squareRoot(int x)
	{
		int i=1;
		do
		{
			i++;
		}while(i*i<=x);;
		return i;
	}
	public static void main(String[]args)
	{
		int x=9;
		System.out.println(squareRoot(x));
	}
}