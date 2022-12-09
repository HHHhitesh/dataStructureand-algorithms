import java.util.Scanner;
//x^n

class Test12
{
	int computingPower(int x,int n)
	{
		//boolean form
		int res=1;
		while(n>0)
		{
			if(n%2!=0)
			{
				res=res*x;
			}
				x=x*x;
				n=n/2;
			

		}
		return res;

	}
	


	public static void main(String[]args)
	{
		Test12 t=new Test12();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.print(x+"^");
		int n=sc.nextInt();
		System.out.print(" = ");
		System.out.print(" "+t.computingPower(x,n));
	}
}