package dsDefinitions;

public class LLNode {
	
	private int data;
	private LLNode next;
	
	public LLNode()
	{
		next =null;
	}
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LLNode getNext() {
		return next;
	}

	public void setNext(LLNode next) {
		this.next = next;
	}


}
