package StacksQueue;

import dsDefinitions.MyStack;

public class CTCIQ2 {
	MyStack s1,s2;
	
	public CTCIQ2()
	{
		s1 = new MyStack();
		s2 = new MyStack();
	}
	
	public void push(int data)
	{
		if(s1.isEmpty())
		{
			s1.push(data);
			s2.push(data);
		}
		else
		{
			s1.push(data);
			if(data<=s2.peek())
			{
				s2.push(data);
			}
		}
	}
	
	public int pop()
	{
		int temp = s1.pop();
		if(temp==s2.peek())
		{
			s2.pop();
		}
		return temp;
	}
	
	public static void main(String args[])
	{
		CTCIQ2 s1 = new CTCIQ2();
		s1.push(5);
		System.out.println("Min : "+ s1.s2.peek());//5
		s1.push(2);
		System.out.println("Min : "+ s1.s2.peek());//2
		s1.push(12);
		System.out.println("Min : "+ s1.s2.peek());//2
		s1.push(3);
		System.out.println("Min : "+ s1.s2.peek());//2
		s1.push(1);
		System.out.println("Min : "+ s1.s2.peek());//1
		s1.push(1);
		System.out.println("Min : "+ s1.s2.peek());//1
		s1.pop();
		System.out.println("Min : "+ s1.s2.peek());//1
		s1.pop();
		System.out.println("Min : "+ s1.s2.peek());//2
		s1.pop();
		System.out.println("Min : "+ s1.s2.peek());//2
		s1.pop();
		System.out.println("Min : "+ s1.s2.peek());//2
		s1.pop();
		System.out.println("Min : "+ s1.s2.peek());//5
	}

}
