//print all prime number less than n
// 10 = 2 3 5 7
import java.util.Scanner;

class Test10
{
	boolean prime(int n)
	{
		if(n==1)
			return false;
		if(n==2||n==3)
			return true;
		if(n%2==0||n%3==0)
			return false;
		for(int i=5;i*i<=n;i=i+6)
		{
			if((n%i==0)||(n%(i+2)==0))
				return false;
		}
		return true;
	}

	void primeNumbers(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(prime(i))
			{
				System.out.print(i+" ");
			}
		}

	}


	
	public static void main(String[]args)
	{
		Test10 t=new Test10();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		t.primeNumbers(x);
		
	}
}