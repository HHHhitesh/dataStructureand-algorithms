import java.util.Scanner;
//prime factor

class Test9
{
	void prime(int n)
	{
		//100=1 2 4 5 10 .... 100
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}

	
	}
	public static void main(String[]args)
	{
		Test9 t=new Test9();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		t.prime(x);
	}
}