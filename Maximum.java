package Arrays;

public class Maximum {

	public static void main(String[] args) {
		int[] a = {10,25,30,15,2};
		int max = a[0];
		
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("maximum array element is :"+max);
	}
}
