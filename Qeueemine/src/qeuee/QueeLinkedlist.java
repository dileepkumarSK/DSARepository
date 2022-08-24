package qeuee;

public class QueeLinkedlist {

	DoubleLinkedList root;
	DoubleLinkedList present;
	
	int lastindex;
	
	
	public void enquee(int value)
	{
		if(lastindex==0)
		{
			DoubleLinkedList n=new DoubleLinkedList(value);
			root=n;
			present=root;
		}
		else 
		{
			DoubleLinkedList n=new DoubleLinkedList(value);
			n.prev=present;
			present.next=n;
			present=n;
			
		}
		lastindex++;
	}

	public void deqeuee()
	{
		if(lastindex==0)
		{
			System.out.println("quee is Empty");
			return;
		}
		else
		{
		  root=root.next;
		  lastindex--;
		}
	}
	
	
	public int getSize()
	{
		return lastindex;
	}
	
	
	public String toString() {
		String s="";
		DoubleLinkedList temp=root;
		for(int i=0;i<lastindex;i++)
		{
			s=s+temp.data+" ";
			temp=temp.next;
			
		}
		return "MyQeuee ["+s+"]";
	}
	
	
}
