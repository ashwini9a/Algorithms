package dsDefinitions;

public class MyQueue {
	int[] array;
	int size;
	
	public MyQueue()
	{
		size=0;
		array = new int[100];
	}
	
	public void enqueue(int data)
	{
		array[size]= data;
		size++;
	}
	
	public void dequeue()
	{
		for(int i=0;i<size-1;i++)
		{
			array[i] = array[i+1];
		}
		size--;
	}

}
