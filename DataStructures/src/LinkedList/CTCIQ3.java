package LinkedList;

import java.util.Scanner;

import dsDefinitions.LLNode;
import dsDefinitions.MyLinkedListHead;

public class CTCIQ3 {
	
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
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		head.display();
		LLNode temp = head.getHead(),prev=head.getHead() ;
		int count=0;
		while(count<k && temp!=null)
		{
			count++;
			prev=temp;
			temp = temp.getNext();
		}
		deleteThis(temp);
		System.out.println();
		head.display();
	}
	
	public static void deleteThis(LLNode temp)
	{
		LLNode prev = temp;
		while(temp.getNext()!=null)
		{
			temp.setData(temp.getNext().getData());
			prev = temp;
			temp = temp.getNext();
			
		}
		prev.setNext(null);
		
	}

}
