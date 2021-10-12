public class SinglyLinkedListP
{
	private Node head;
	public static class Node
	{
		private int data;
		private Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	
	public static void main(String args[])
	{
		SinglyLinkedListP sll=new SinglyLinkedListP();
		sll.insertAtFirst(10);
		//sll.insertAtFirst(20);
		//sll.insertAtFirst(30);
		//sll.displayData();
	    //System.out.println("\nLinked List after inserting a node at last:\t");
		//sll.insertAtLast(50);
		//sll.insertAtFirst(10);
		//sll.insertAtLast(60);
		sll.displayData();
		//System.out.println("\nSize of Singly Linked List :"+sll.size());
		//System.out.println("\nLinked List after deleting first element :"+sll.deleteFirst().data);
		//sll.displayData();
		System.out.println("\nLinked List after deeleting the last node from the linked list :"+sll.deleteLastNode().data);
		sll.displayData();
	}
	public void insertAtFirst(int value)
	{
		Node newNode=new Node(value);
		newNode.next=head;
		head=newNode;		
	}
	public void displayData()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("null");
	}
	public void insertAtLast(int value)
	{
		Node newNode=new Node(value);
		if(head==null)
		{
			head=newNode;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newNode;
	}
	public int size()
	{
		if(head==null)
		{
			return 0;
		}
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	public Node deleteFirst()
	{
		if(head==null)
		{
				return null;
		}
		Node current=head;
		head=head.next;
		current.next=null;
		return current;
	}
	public Node deleteLastNode()
	{
		if(head==null)
		{
			return null;
		}
		else if(head.next==null)
		{
			Node temp=head;
			head=head.next;
			return temp;
		}
		Node previous=null;
		Node current=head;
		while(current.next!=null)
		{
			previous=current;
			current=current.next;
		}
		previous.next=null;
		return current;
	}
}