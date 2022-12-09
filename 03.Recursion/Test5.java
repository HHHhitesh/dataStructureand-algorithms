//sumOfDigits
class Test5
{
	static void subsets(String s,String curr,int i)	
	{
		i=0;
		curr="";
		if(i==s.length())
		{
			System.out.println(s);
			return;
		}
		subsets(s,curr,i+1);
		subsets(s,curr+charAt(i),i+1);	
	}
	public static void main(String[]args)
	{
		
		subsets("hello");
	}
}