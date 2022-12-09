import java.util.Scanner;
class Test1
{
	public static void main(String[]args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.print("x: ");
		int x=sc.nextInt();
		System.out.print("y: ");
		int y=sc.nextInt();
		System.out.print("x&y : ");
		System.out.println(x&y);
		System.out.print("x|y : ");
		System.out.println(x|y);
		System.out.print("x^y : ");
		System.out.println(x^y);
		System.out.print("~x : ");
		System.out.println(~x);
		System.out.println("<<");
		System.out.println(x<<1);
		System.out.println(x<<2);
		System.out.print(x<<y);

	}
}