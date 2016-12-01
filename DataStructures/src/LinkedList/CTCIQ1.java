package LinkedList;

import dsDefinitions.LLNode;
import dsDefinitions.MyLinkedListHead;

public class CTCIQ1 {
	
	public static void main(String args[])
	{
		MyLinkedListHead head = new MyLinkedListHead();
		head.insertAtEnd(1);
		head.insertAtEnd(2);
		head.insertAtEnd(3);
		head.insertAtEnd(4);
		head.insertAtEnd(5);
		head.insertAtEnd(5);
		head.insertAtEnd(6);
		head.insertAtEnd(8);
		head.insertAtEnd(99);
		head.insertAtEnd(1);
		head.insertAtEnd(4);
		
		head.display();
		System.out.println();
		removeDuplicates(head);
		head.display();
	}

	public static void removeDuplicates(MyLinkedListHead head)
	{
		LLNode temp = head.getHead() ;
		while(temp!=null)
		{
			LLNode temp2 = temp.getNext(),prev = temp;
			while(temp2!=null)
			{
				if(temp.getData()== temp2.getData())
				{
					prev.setNext(temp2.getNext());
				}
				prev=temp2;
				temp2 = temp2.getNext();
			}
			temp = temp.getNext();
		}
			
	}
}