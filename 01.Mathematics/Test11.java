import java.util.Scanner;
//x^n

class Test11
{
	int computingPower(int x,int n)
	{
		int z=1;
		for(int i=1;i<=n;i++)
		{
			z=z*x;
		}
		return z;
	}
	


	public static void main(String[]args)
	{
		Test11 t=new Test11();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.print(x+"^");
		int n=sc.nextInt();
		System.out.print(" = ");
		System.out.print(" "+t.computingPower(x,n));
	}
}