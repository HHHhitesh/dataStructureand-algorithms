import java.util.Scanner;
//prime factor

class Test8
{
	void prime(int n)
	{
		for(int i=2;i*i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}
		}	
		if(n>1)
			System.out.println(n);

	
	}
	public static void main(String[]args)
	{
		Test8 t=new Test8();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		t.prime(x);
	}
}