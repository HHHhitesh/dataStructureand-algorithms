class MyStack
{
	int arr[];
	int cap;
	int top;
	MyStack(int c)
	{
		top=-1;
		cap=c;
		arr=new int[cap];
	}
	void push(int x)
	{
		top=top+1;
		arr[top]=x;
	}
	// void peek(int x)
	// {
	// 	x=arr[top];
	// }
	int pop()
	{
		int res=arr[top];
		top=top-1;
		return top;
	}
	int size()
	{
		return top+1;
	}
	boolean isEmpty()
	{
		return  (top==-1);
	}

}
class Test1
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