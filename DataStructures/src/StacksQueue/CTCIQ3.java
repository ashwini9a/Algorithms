package StacksQueue;

import java.util.ArrayList;
import java.util.Iterator;

import dsDefinitions.MyStack;

public class CTCIQ3 {
	
	ArrayList stacks;
	int size;
	public CTCIQ3()
	{
		stacks = new ArrayList<>();
		size =0 ;
	}
	
	public void push(int data)
	{
		int len = stacks.size();
		if(len==0)
		{
			MyStack s1 = new MyStack();
			s1.push(data);
			stacks.add(s1);
			size++;
		}
		else
		{
			Iterator<MyStack> itr = stacks.iterator();
			while(itr.hasNext())
			{
				MyStack s =itr.next();
				if(s.getSize()<5)
				{
					s.push(data);
					return;
				}
			}
			MyStack s1 = new MyStack();
			s1.push(data);
			stacks.add(s1);
			size++;
		}
	}
	public int pop()
	{
		int len = stacks.size();
		int val=-1;
		if(len==0)
		{
			System.out.println("Empty Stack");
		}
		else
		{
			MyStack s = (MyStack) stacks.get(len-1);
			val = s.pop();
			if(s.getSize()==0)
			{
				stacks.remove(len-1);
				size--;
			}
		}
		return val;
	}
	
	public static void main(String args[])
	{
		CTCIQ3 c = new CTCIQ3();
		c.push(5);
		c.push(23);
		c.push(3);
		c.push(1);
		c.push(8);
		c.push(34);
		System.out.println(c.pop());
		System.out.println(c.pop());
		System.out.println(c.pop());
		c.push(7);
		System.out.println(c.pop());
		c.push(23);
		System.out.println(c.pop());
		c.push(0);
		System.out.println(c.pop());
		System.out.println(c.pop());
		System.out.println(c.pop());
		System.out.println(c.pop());
		System.out.println(c.pop());
	}

}
