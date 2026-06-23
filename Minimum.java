package Arrays;

public class Minimum {

	public static void main(String[] args) {
		int[] a = {10,25,30,15,2};
		int min =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Minimum element of array is :"+min);
	}
}
