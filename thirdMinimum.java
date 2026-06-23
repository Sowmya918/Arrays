package Arrays;

public class thirdMinimum {

	public static void main(String[] args) {
		int[] a = {10,15,20,13,11,20};
		
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int min3 = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min1)
			{
				min3=min2;
				min2=min1;
				min1=a[i];				
			}
			else if(a[i]<min2 && a[i]!=min1)
			{
				min3=min2;
				min2=a[i];
			}
			else if(a[i]<min3 && a[i]!=min1 && a[i]!=min2)
			{
				min3=a[i];
			}
		}
		System.out.println("First minimum element is :"+min1);
		System.out.println("Second minimum element is :"+min2);
		System.out.println("Third minimum element is :"+min3);
	}
}
