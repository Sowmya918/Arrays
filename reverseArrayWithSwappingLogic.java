package Arrays;

import java.util.Arrays;

public class reverseArrayWithSwappingLogic {

	public static void main(String[] args) {
		int[] a = {10,20,30,40};
		
		int st=0, end=a.length-1;
		
		while(st<end) {
		int temp = a[st];
		    a[st]=a[end];
		    a[end]=temp;
		    st++;
		    end--;
	}
		System.out.println(Arrays.toString(a));
	}
}
