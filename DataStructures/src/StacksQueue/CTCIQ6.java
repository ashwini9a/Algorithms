package StacksQueue;

import dsDefinitions.MyStack;

public class CTCIQ6 {

	public static void sort(MyStack s,MyStack s2)
	{
		while(!s.isEmpty())
		{
			int data = s.pop();
			int len = s2.getSize();
			if(len!= 0)
			{
				
				while(true)
				{
					if(s2.getSize() > 0 )
					{
						if(s2.peek() > data)
						{
							s.push(s2.pop());
						}
						else
						{
							s2.push(data);
							break;
						}
					}
					else
					{
						s2.push(data);
						break;
					}
					
				}
			}
			else
			{
				s2.push(data);
			}
			
		}
	}
	
	public static void main(String args[])
	{
		MyStack s = new MyStack();
		MyStack s2 = new MyStack();
		s.push(4);
		s.push(54);
		s.push(76);
		s.push(2);
		s.push(8);
		s.push(10);
		s.push(3);
		s.push(67);
		s.push(78);
		
		sort(s,s2);
		
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		
	}
}
