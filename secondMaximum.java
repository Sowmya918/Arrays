package Arrays;

public class secondMaximum {

	public static void main(String[] args) {
		int[] a = {10,50,30,40,20};
		
		int max1=a[0],max2=Integer.MIN_VALUE;
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2 && a[i]!=max1)
			{
				max2=a[i];
			}
		}
		System.out.println("Second Maximum element of the array is :"+max2);
	}
}
