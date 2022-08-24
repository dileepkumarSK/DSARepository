package statcks;

public class StackLinkedList 
{
	DoubleLinkedNode root;
	DoubleLinkedNode present;
	int lastindex;
	
	public void push(int value)
	{
		if(lastindex==0)
		{
			DoubleLinkedNode n=new DoubleLinkedNode(value);
			root=n;
			present=root;
			
		}
		else 
		{
			DoubleLinkedNode n=new DoubleLinkedNode(value);
			n.prev=present;
			present.next=n;
			present=n;
			
		}
		lastindex++;
	}
	
	public int pop()
	{
		int x=0;
		if(lastindex==0)
		{
			
			lastindex=0;
		}
		else {
		DoubleLinkedNode temp=root;
		for(int i=0;i<lastindex-1;i++)
		{
			temp=temp.next;
		}
		x=temp.data;
		if(temp.prev==null)
			System.out.println("Stck empty");
		else
		temp.prev.next=null;
		lastindex--;
		}
		return x;
		
	}
	
	public int peek()
	{
		DoubleLinkedNode temp=root;
		for(int i=0;i<lastindex-1;i++)
		{
			temp=temp.next;
		}
		return temp.data;
	}

	@Override
	public String toString() {
		String s="";
		DoubleLinkedNode temp=root;
		for(int i=0;i<lastindex;i++)
		{
			s=s+temp.data+" ";
			
			temp=temp.next;
		}
		
		return "StackLinkedList ["+s+"]";
	}
	
	

	
}
