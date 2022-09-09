package sortings;

public class BubbleSorting {
   
	public int[] soring(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		return a;
		
	}
	
	
	public static void main(String[] args)
	{
		int m[]=new BubbleSorting().soring(new int[] {9,3,4,2,1,5,6,7,7});
		for(int x:m)
		{
			System.out.println(x);
		}

	}

}
