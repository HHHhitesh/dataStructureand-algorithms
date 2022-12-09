class Test02
{

	public static void main(String[]args)
	{
		String s1="geeksforgeek";
		String s2="geeksforgeek";
		// contains()
		// equals()
		// compareTo()
		// indexOf()
		// System.out.println(s1.contains(s2));
		// System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		int res=s1.compareTo(s2);
		if(res==0)
			System.out.println("same");
		else
			{
				if(res<0)
			System.out.println(s1+" is smaller than "+s2);
		else
			System.out.println(s1+" is greater than "+s2);
			}
	}
}