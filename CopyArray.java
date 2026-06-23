package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
//		using traversing
		System.out.println(Arrays.toString(copy(a)));
		// copy inbuilt method
		int [] b = Arrays.copyOf(a,a.length);
		System.out.println(Arrays.toString(a));
	}
		
		public static int[] copy(int[] a)
		{
			int[] b = new int[a.length];
			
			for(int i=0;i<a.length;i++)
			{
				b[i]=a[i];
			}
			return b;
		}
	
}
