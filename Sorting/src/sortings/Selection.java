package sortings;

public class Selection {

	public int[] sorting(int a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			int min=a[i],index=0;
			for(int j=i;j<a.length-i-1;j++)
			{
				if(min>a[j])
				{
					min=a[j];
					index=j;
				}
			}
			
			int temp=a[i];
			a[i]=min;
			a[index]=temp;
			
		}
		return a;
	}
	public static void main(String[] args) {
		int m[]=new BubbleSorting().soring(new int[] {9,3,4,2,1,5,6,7,8});
		for(int x:m)
		{
			System.out.println(x);
		}

	}

}
