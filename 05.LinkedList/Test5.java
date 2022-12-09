//10 20 30 add 5 in last node
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
class Test5
{
	public static Node insertEnd(Node head,int x)
	{
		Node temp=new Node(x);
		if(head ==null)
			return temp;
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=temp;
		return head;
	}

	public static void main(String[]args)
	{
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(40);
		insertEnd(head,300);
	}
}