package Arrays;

public class secondMinimum {

	public static void main(String[] args) {
		int[] a = {10,50,30,40,20};
		int min1=a[0],min2=Integer.MAX_VALUE;
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min1)
			{
				min2=min1;
				min1=a[i];
			}
			else if(a[i]<min2 &&a[i]!=min1)
			{
				min2=a[i];
			}
		}
		System.out.println("Second Minimum element of array is :"+min2);
	}
}
