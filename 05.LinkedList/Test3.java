//linked list rPrint 10 20 30 40 50
class Node
{
	int data;
	Node next;
	Node(int x)
	{
		data=x;
		next=null;
	}
}
class Test3
{
	public static void main(String[]args)
	{
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		rPrintList(head);
	}
	public static void rPrintList(Node head)
	{
		if(head==null)
			return;
		System.out.print(head.data+" ");
		rPrintList(head.next);
	}
}