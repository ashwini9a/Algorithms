package dsDefinitions;

import java.util.ArrayList;

public class MyStack {

	ArrayList Stack;
	int size;
	
	public int getSize()
	{
		return size;
	}
	public MyStack()
	{
		Stack =new ArrayList<>();
		size =0;
	}
	public void push(int data)
	{
		Stack.add(data);
		size++;
	}
	
	public int peek()
	{
		if(size==0)
		{
			System.out.println("Empty Stack");
			return -1;
		}
		int temp = (int) Stack.get(size-1);
		return temp;
	}
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		return false;
	}
	
	public int pop()
	{
		if(size==0)
		{
			System.out.println("Empty Stack");
			return -1;
		}
		int temp = (int) Stack.get(size-1);
		Stack.remove(size-1);
		size--;
		return temp;
	}
	
	
}
