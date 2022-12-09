import java.util.Scanner;
class Test4
{
	public boolean isPowOf2(int n)
	{
		if(n==0)
			return false;
		return (n&(n-1))==0;
	}
	// {
	// 	if(n==0)
	// 		return false;
	// 	while(n!=1)
	// 	{
	// 		if(n%2!=0)
	// 		{
	// 			return false;
	// 		}
	// 		n=n/2;
	// 	}
	// 	return true;
	// }
	public static void main(String[]args)
	{
		Test4 t=new Test4();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(t.isPowOf2(x));

	}
}