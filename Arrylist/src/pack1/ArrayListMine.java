package pack1;

public class ArrayListMine {

	int cap=10;
	int len=0;
	private int arrayofmine[]=new int[cap];
	private int arrayofmine1[];
	
	public void add(int e)
	{
		if(len==cap-1)
		{
			cap=cap*2;
			arrayofmine1=new int[cap];
			for(int i=0;i<=len;i++)
			{
				arrayofmine1[i]=arrayofmine[i];
			}
			arrayofmine=arrayofmine1;
		}
		
		arrayofmine[len]=e;
		len++;
		
	}
	
	public void remove()
	{
		if(len==0)
		{
			System.out.println("empty");
		}
		else
		{
			arrayofmine[len]=0;
			len--;
		}
			
	}
	
	public void remove(int index)
	{
		if(len==0)
		{
			System.out.println("empty");
		}
		else
		{
			for(int i=index;i<len;i++)
			{
				arrayofmine[index]=arrayofmine[index+1];
				
			}
			len--;
		}
			
	}
	
	public void replace(int index ,int value)
	{
		arrayofmine[index]=value;
	}

	public void replaceAll(int oldvalue ,int changevalue)
	{
		for(int i=0;i<len;i++)
		{
			if(arrayofmine[i]==oldvalue)
				arrayofmine[i]=changevalue;
		}
	}
	
   public int get(int index)
   {
	  return arrayofmine[index]; 
   }

   public int getsize()
   {
	  return len; 
   }

   public int getCapacity()
   {
	  return cap; 
   }
	public String toString() {
		String arrylist="";
		for(int i=0;i<len;i++)
		{
			arrylist+=arrayofmine[i]+" ";
		}
		
		return "ArrayListMine [ arrayofmine= " + arrylist+ "]";
	}
	
	
}
