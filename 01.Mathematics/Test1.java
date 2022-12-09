import java.util.Scanner;
class Test1
{
	int Count(int x)
	{
		int count=0;
		while(x>0)
		{
			x=x/10;
			count++;
		}
		return count;
	}
	public static void main(String[]args)
	{
		Test1 t=new Test1();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(t.Count(x));
	}
}