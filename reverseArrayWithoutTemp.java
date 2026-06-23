package Arrays;

import java.util.Arrays;

public class reverseArrayWithoutTemp {

	public static void main(String[] args) {
		
        int[] a = {10,20,30,40};
		
		int st=0, end=a.length-1;
		
		while(st<end)
		{
			a[st] = a[st]+a[end];
			a[end] = a[st]-a[end];
			a[st] = a[st]-a[end];
			st++;
			end--;
		}
		System.out.println(Arrays.toString(a));
	}
}
