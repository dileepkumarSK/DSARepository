package minelist;

public class LInkedListMine {

	Node root;
	Node present;
	int lastindex=0;
	
	public void add(int data)
	{
		
		if(lastindex==0)
		{
			root=new Node(data);
			 present=root;
			
		}
		else 
		{
			present.next=new Node(data);
			present=present.next;
			
		}
		lastindex++;
		
	}
	
	
	public void remove()
	{
		Node temp=root;
		for(int i=0;i<lastindex-2;i++)
		{
			//System.out.println(temp.data+ " "+i+" "+temp.next.data);
			temp=temp.next;
			
		}
		temp.next=null;
		lastindex--;
	}
	
	public int getSize()
	{
		return lastindex;
	}
	
	
	public int get(int index)
	{
		Node temp=root;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		return temp.data;
	}
	public void insertAt(int index,int data)
	{
		if(index==0)
		{   Node n=new Node(data);
			n.next=root;
			root=n;
		}
		else {
			Node temp=root;
			for(int i=0;i<index-1;i++)
			{
				
				temp=temp.next;
				
			}
			
			Node n=new Node(data); 
			n.next=temp.next; 
			temp.next=n;	
			
		}
		lastindex++;
	
	}
	
	public void deleteAt(int index)
	{
		if(index==0)
		{   
			root=root.next;
		}
		else {
			Node temp=root;
			for(int i=0;i<index-1;i++)
			{
				
				temp=temp.next;
				
				
			}
			temp.next=temp.next.next;
			
		}
		lastindex--;
		
	}	

	public String toString() {
		String s="";
		Node temp=root;
		for(int i=0;i<lastindex;i++)
		{
			s=s+temp.data+" ";
			temp=temp.next;
		}
		return "LInkedListMine ["+ s +"]";
	}
}
