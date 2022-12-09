//count set bit
import java.util.Scanner;
class Test3
{
	int setBits(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n&(n-1);
			count++;
		}
		return count;
	}
	// {
	// 	int count=0;
	// 	while(n>0)
	// 	{
	// 		if(n%2==1)
	// 			count++;
	// 		n=n/2;
	// 	}
	// 	return count;
	// }
	public static void main(String[]args)
	{
		Test3 t=new Test3();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(t.setBits(x));


	}
}