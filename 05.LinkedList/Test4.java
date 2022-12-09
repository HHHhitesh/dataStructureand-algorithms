//10 20 30   add 5 in first node
class Node
{
	int data;
	Node next;
	Node (int x)
	{
		data=x;
		next=null;
	}
}
class Test4
{
	public static Node insertBegin(Node head,int x)
	{
		Node temp=new Node(x);
		temp.next=head;
		return head;

	}
	public static void main(String[]args)
	{
		Node head=new Node(20);
		head.next=new Node(30);
		head.next.next=new Node(40);
		insertBegin(head,300);
	}
}