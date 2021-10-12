public class LinkedList
{
	private ListNode head;
	public static class ListNode
	{
		private ListNode next;
		private int data;
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
			
		}
	}
	public static void main(String args[])
	{
		LinkedList sll=new LinkedList();
		sll.insertFirst(10);
		sll.insertFirst(20);
		sll.insertFirst(30);
		sll.insertFirst(40);
		sll.insertEnd(50);
		sll.insertEnd(60);
	    sll.display();
		sll.deleteFirst();
		System.out.println("\n Linked List after Deleting first Node :");
		sll.display();
		System.out.println("\n Linked List after Deleting Last Node :");
		sll.deleteLast();
		System.out.println("");
		sll.display();
		
	}
	//How to print elements of singly linked list in java
	//ListNode current =head
	public void display()
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;	
		}
		System.out.print("null");
		
	}
	//Find the length of a Singly Linked List in Java
	public int length()
	{
		if(head==null)
		{
			return 0;
		}
		ListNode current=head;
		int count=0;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}
	//Write an algorithm to insert a node at the beginning of a Singly Linked List in Java
	public void insertFirst(int value)
	{
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;		
	}
	//Write an algorithm to insert a node at the end of a Singly Linked List in Java
	public void insertEnd(int value)
	{
		ListNode newNode=new ListNode(value);
		if(head==null)
		{
			head=newNode;
		}
		ListNode current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newNode;
	}
	//Write an algorithm to delete first node of a Singly Linked List in Java
	public ListNode deleteFirst()
	{
		if(head==null)
		{
			return null;
		}
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		return temp;
	}
	//Write an algorithm to delete last node of a Singly Linked List in Java

	public ListNode deleteLast()
	{
		if(head==null||head.next==null)
		{
			return null;
		}
		ListNode previous=null;
		ListNode current=head;
		while(current.next!=null)
		{
			previous=current;
			current=current.next;
		}
		previous.next=null;
		return current;
	
	}
	
}