import java.util.Scanner;
class Test4
{
	//Trailing zeros in factorial
	// int trailingZeros(int n)
	// {
	// 	int fact=1;
	// 	for(int i=2;i<=n;i++)
	// 	{
	// 		fact=fact*i;
	// 	}
	// 	//fact= "factorial"
	// 	int count=0;
	// 	while(fact%10==0)
	// 	{
	// 		count=count+1;
	// 		fact=fact/10;
	// 	}
	// 	return count;
	// }

	int trailingZeros(int n)
	{
		int count=0;
		for(int i=5;i<=n;i=i*5)
		{
			count=count+n/i;
		}
		return count;
	}

	public static void main(String[]args)
	{
		Test4 t=new Test4();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(t.trailingZeros(x));
	}
}