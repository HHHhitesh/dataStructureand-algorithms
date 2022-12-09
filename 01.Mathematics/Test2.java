import java.util.Scanner;
class Test2
{
	boolean palindrome(int n)
	{
		int temp=0;
		int x=n;
		while(x!=0)
		{
			temp=temp*10+x%10;
			x=x/10;
		}
		return (temp==n);
	}
	public static void main(String[]args)
	{
		Test2 t=new Test2();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(t.palindrome(x));
	}
}