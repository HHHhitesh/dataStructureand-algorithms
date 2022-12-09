import java.util.Scanner;
//kth bit is set or not for int x
class Test2
{
	boolean kthBitSet(int n, int k)
	{
		int x=1<<(k-1);
		// int x=1;
		// for(int i=1;i<=(k-1);i++)
		// {
		// 	x=x*2;
		// }
		if((n&x)!=0)
			return true;
		else
			return false;
	}
	public static void main(String[]args)
	{
		Test2 t=new Test2();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(t.kthBitSet(n,k));
		
	}	
}