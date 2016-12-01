package dsDefinitions;

public class MyLinkedListHead {
	LLNode head;
	int size;
	
	public LLNode getHead() {
		return head;
	}
	public void setHead(LLNode head) {
		this.head = head;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public MyLinkedListHead()
	{
		head=null;
		size=0;
	}
	public void display()
	{
		LLNode temp = head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}
	}
	public void insertAtEnd(int val)
	{
		if(size==0)
		{
			head = new LLNode();
			head.setData(val);
		}
		else
		{
			LLNode temp = head.getNext(),prev=head;
			while(temp!=null)
			{
				prev = temp;
				temp = temp.getNext();
			}
			temp = new LLNode();
			temp.setData(val);
			prev.setNext(temp);
		}
		
		size++;
	}
	public void insertAtBeg(int val)
	{
		LLNode temp = new LLNode();
		temp.setNext(head);
		head = temp;
		size++;
	}
	
	public void insertAt(int index, int val)
	{
		int cnt=0;
		LLNode temp = head.getNext();
		while(cnt!=index && temp!=null)
		{
			temp = temp.getNext();
			cnt++;
		}
		if(temp==null)
		{
			System.out.println("OverFlow");
			return;
		}
		LLNode newN = new LLNode();
		newN.setNext(temp.getNext());
		temp.setNext(newN);
		size++;
	}

	public void deleteFirst()
	{
		head = head.getNext();
		size--;
	}

	public void deleteAt(int index)
	{
		int cnt=0;
		LLNode temp = head,prev=head;
		while(cnt!=index && temp.getNext()!=null)
		{
			prev=temp;
			temp = temp.getNext();
			cnt++;
		}
		prev.setNext(temp.getNext());
		size--;
	}
	
	public void deleteEnd()
	{
		if(size!=0)
		{
			LLNode temp = head,prev=head;
			while(temp.getNext()!=null)
			{
				prev=temp;
				temp = temp.getNext();
			}
			prev.setNext(null);
			size--;
		}
		else
		{
			System.out.println("UnderFlow");;
		}
		
	}
	public int getDataAt(int index)
	{
		int cnt=0;
		LLNode temp = head.getNext();
		while(cnt!=index && temp!=null)
		{
			temp = temp.getNext();
			cnt++;
		}
		if(temp==null)
		{
			System.out.println("OverFlow");
			return -1;
		}
		return temp.getData();
	}

	public int getFirstData(int index)
	{
		return head.getData();
	}
	public int getLastData(int index)
	{
		LLNode temp = head,prev=head;
		while(temp!=null)
		{
			prev=temp;
			temp = temp.getNext();
		}
		if(prev==null)
			return -1;
		return prev.getData();
	}
}
