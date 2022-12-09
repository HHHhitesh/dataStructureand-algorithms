import java.util.Scanner;
class Test3
{
	// //iterative solution
	// int factorial(int n)
	// {
	// 	int fact=1;
	// 	if(n==0)
	// 	{
	// 		return 1;
	// 	}
	// 	while(n!=0)
	// 	{
	// 		fact=fact*n;
	// 		n=n-1;
	// 	}
	// 	return fact;
	// }

	//recursive solution
	int factorial(int n)
	{
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}
	
	public static void main(String[]args)
	{
		Test3 t=new Test3();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(t.factorial(x));
	}
}