package minelist;

public class DoubleLinkedList {

	DoubleNode root;
	DoubleNode present;
	int lastindex=0;
	
	public void add(int value)
	{
		
		if(lastindex==0)
		{   DoubleNode n=new DoubleNode(value);
			root=n;
			present=root;
			
		}
		else 
		{
			
			DoubleNode n=new DoubleNode(value);
			
			n.prev=present;
			present.next=n;
			
			present =n;	
		}
		lastindex++;
	}

	
	public void remove()
	{
		present.prev.next=null;
		lastindex--;
			
	}
	
	public void insertAt(int index,int value)
	{
	
		DoubleNode temp=root;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		DoubleNode n=new DoubleNode(value);
		temp.prev.next=n;
		n.next=temp;
	    temp.prev=n;
		
		lastindex++;
		
		
	}
	
	
	public void replaceAt(int index,int value)
	{
	
		DoubleNode temp=root;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
	
		temp.data=value;
		
	}
	
	
	
	public int getsize()
	{
		return lastindex;
	}
	
	public int get(int index)
	{
		DoubleNode temp=root;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		return temp.data;
	}
	
	public String toString() {
		DoubleNode temp=root;
		String s="";
		
		for(int i=0;i<lastindex;i++)
		{
			s=s+temp.data+" ";
			
			temp=temp.next;
			
		}
		return "DoubleLinkedList [ "+s+"]";
	}
	
	
	
	
}
