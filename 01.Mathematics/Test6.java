//lcm
import java.util.Scanner;

class Test6
{
	public int lcm(int x,int y)
	{
		int m=Math.max(x,y);
		while(true)
		{
			if((m%x==0)&&(m%y==0))
			{
				return m;
			}
			m++;
		}
		return m;
	}
	public static void main(String[]args)
	{
		Test6 t=new Test6();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(t.lcm(x,y));

	}
}