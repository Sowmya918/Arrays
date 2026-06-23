package Arrays;

public class thirdMaximum {

	public static void main(String[] args) {
		int[] a = {10,5,15,20,1,20};
		
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int max3=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max3=max2;
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2 && a[i]!=max1)
			{
				max3=max2;
				max2=a[i];
			}
			else if(a[i]>max3 && a[i]!=max1 && a[i]!=max2)
			{
				max3=a[i];
			}
		}
		System.out.println("First maximum element is :"+max1);
		System.out.println("Second maximum element is :"+max2);
		System.out.println("Third maximum element is :"+max3);
	}
}
