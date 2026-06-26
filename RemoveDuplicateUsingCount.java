package Arrays;

import java.util.Arrays;

public class RemoveDuplicateUsingCount {

	public static void main(String[] args) {
		int[] a = {10,20,10,20,30};
		System.out.println(Arrays.toString(removeDuplicate(a)));
	}
	
	public static int[] removeDuplicate(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && a[i]!=Integer.MAX_VALUE) {
					a[j]=Integer.MAX_VALUE;
				    count++;
				}
			}
		}
		int[] b = new int[a.length-count];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=Integer.MAX_VALUE)
				b[j++] =a[i];
		}
		return b;
		  
	}
}
