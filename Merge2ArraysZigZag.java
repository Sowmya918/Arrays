package Arrays;

import java.util.Arrays;

public class Merge2ArraysZigZag {

	public static void main(String[] args) {
		int[] a = {10,20,30,45,60};
		int[] b = {40,50};
		System.out.println(Arrays.toString(ZigZag(a,b)));
		
	}
	
	public static int[] ZigZag(int[] a ,int[] b)
	{
		int[] c = new int[a.length+b.length];
		int j=0,k=0;
		for(int i=0;i<c.length;)
		{
			if(j<a.length) {
				c[i++]=a[j++];
			}
			if(k<b.length)
			{
				c[i++]=b[k++];
				
			}
		}
		return c;
	}
}
