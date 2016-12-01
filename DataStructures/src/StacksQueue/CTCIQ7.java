package StacksQueue;

import java.util.LinkedList;

public class CTCIQ7 {
	LinkedList<Animal> Queue;
	LinkedList<Dog> DQ;
	LinkedList<Cat> CQ;

	public CTCIQ7()
	{
		DQ = new LinkedList<>();
		CQ = new LinkedList<>();
	}
	
	public void enqueue(Animal temp)
	{
		if((temp)instanceof Dog)
		{
			DQ.add((Dog) temp);
		}
		if((temp)instanceof Cat)
		{
			CQ.add((Cat) temp);
		}
	}
	
	public Animal dequeueAny()
	{
		if(DQ.getFirst().order < CQ.getFirst().order)
		{
			return DQ.removeFirst();
		}
		else
		{
			return CQ.removeFirst();
		}
	}
	public Dog dequeueD()
	{
		return DQ.removeFirst();
	}
	
	public Cat dequeueC()
	{
		return CQ.removeFirst();
	}
	
	public static void main(String args[])
	{
		CTCIQ7 c =new CTCIQ7();
		Dog d1 = new Dog(1);
		c.enqueue(d1);
		Cat c1 = new Cat(2);
		c.enqueue(c1);
		Dog d2 = new Dog(3);
		c.enqueue(d2);
		Dog d3 = new Dog(4);
		c.enqueue(d3);
		Dog d4 = new Dog(5);
		c.enqueue(d4);
		Cat c2 = new Cat(6);
		c.enqueue(c2);
		Dog d5 = new Dog(7);
		c.enqueue(d5);
		Dog d6 = new Dog(8);
		c.enqueue(d6);
		Cat c3 = new Cat(9);
		c.enqueue(c3);
		
		
		System.out.println("Dog:"+ c.dequeueAny().order);
		System.out.println("Cat:"+ c.dequeueAny().order);
		System.out.println("Dog:"+ c.dequeueAny().order);
		System.out.println("Dog:"+ c.dequeueD().order);
		System.out.println("Cat:"+ c.dequeueC().order);
		System.out.println("A:"+ c.dequeueAny().order);
		System.out.println("A:"+ c.dequeueAny().order);
		System.out.println("A:"+ c.dequeueAny().order);
	
		
	}
}
