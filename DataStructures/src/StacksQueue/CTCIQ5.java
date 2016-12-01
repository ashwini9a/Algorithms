package StacksQueue;

import dsDefinitions.MyStack;

public class CTCIQ5 {
	MyStack New, Old;
	
	public CTCIQ5()
	{
		New = new MyStack();
		Old = new MyStack();
	}
	
	public void enqueue(int data)
	{
		New.push(data);
	}
	public int dequeue()
	{
		shift();
		return Old.pop();
	}
	
	public void shift()
	{
		if(Old.getSize()==0)
		{
			int size = New.getSize();
			for(int i=0;i<size;i++)
			{
				Old.push(New.pop());
			}
		}
	}
	public static void main(String args[])
	{
		CTCIQ5 c = new CTCIQ5();
		c.enqueue(10);
		c.enqueue(4);
		c.enqueue(2);
		c.enqueue(8);
		c.enqueue(45);
		c.enqueue(32);
		System.out.println(c.dequeue());
		System.out.println(c.dequeue());
		System.out.println(c.dequeue());
		System.out.println(c.dequeue());
		System.out.println(c.dequeue());
		
	}
	

}
