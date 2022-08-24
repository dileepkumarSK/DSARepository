package qeuee;

public class MyQeuee {

	private int array[]=new int[100];
	int lastindex;
	
	public void enquee(int value)
	{
		if(lastindex==100)
			
			System.out.println("qeue is full");
		else 
		{
			array[lastindex]=value;
			lastindex++;
		}
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
		  for(int i=0;i<lastindex;i++)
		  {
			 array[i]=array[i+1]; 
		  }
		  lastindex--;
		}
	}
	
	
	public int getSize()
	{
		return lastindex;
	}
	
	
	public String toString() {
		String s="";
		for(int i=0;i<lastindex;i++)
		{
			s=s+array[i]+" ";
		}
		return "MyQeuee ["+s+"]";
	}
	
	
	
}
