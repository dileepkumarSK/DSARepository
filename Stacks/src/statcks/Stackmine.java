package statcks;

public class Stackmine 
{
private int stack[]=new int[100];

int top,lastindex;

	public void	push(int value)
	{
		if(lastindex>100)
		{
		
			System.out.println("stack full");
		}else {
		stack[lastindex]=value;
		
		lastindex++;}
	}
	public int pop()
	{
		int x=0;
		if(lastindex==0)
		{
			System.out.println("stack empty");
			lastindex=0;
		}
		else 
		{
		x=stack[lastindex];
		stack[lastindex]=0;
		lastindex--;
		}
		return x ;
	}
	public int peek()
	{
		return stack[lastindex-1];
	}
	
	public String toString() {
		String s="";
	     for(int i=0;i<lastindex;i++)
	     {
	    	 s=s+stack[i]+" ";
	     }
		return "Stackmine [ "+s+ "]";
	}

}
