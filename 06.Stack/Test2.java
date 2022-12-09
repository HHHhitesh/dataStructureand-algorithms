import java.util.ArrayList;
class MyStack
{
	ArrayList<Integer> al=new ArrayList<>();

	void push(int x)
	{
		al.add(x);
	}
	int pop()
	{
		int res=al.get(al.size()-1);
		al.remove(al.size()-1);
		return res;
	}
	int peek()
	{
		return al.get(al.size()-1);
	}
	boolean isEmpty()
	{
		return al.isEmpty();
	}
	int size()
	{
		return al.size();
	}
}
class Test2
{
	public static void main(String[]args)
	{
		MyStack s=new MyStack(10);
		s.push(5);
		s.push(15);
		s.push(20);
		// System.out.println(s.peek());
		System.out.println(s.pop());
		s.push(35);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
	}
}