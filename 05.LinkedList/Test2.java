//linked list print 10 20 30 40 50
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
class Test2
{
	public static void main(String[]args)
	{
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		printList(head);
	}
	public static void printList(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	
}







































// public static void printList(Node head)
// 	{
// 		Node curr=head;
// 		while(curr!=null)
// 		{
// 			System.out.print(curr.data+" ");
// 			curr=curr.next;
// 		}
// 	}