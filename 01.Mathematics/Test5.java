import java.util.Scanner;
class Test5
{
	int hcf(int a,int b)
	{
		int res=Math.min(a,b);
		while(res>0)
		{
			if(a%res==0 && b%res==0)
			{
				break;
			}
			res--;
		}
			return res;
	}
	public static void main(String[]args)
	{
		Test5 t=new Test5();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(t.hcf(a,b));
	}
}