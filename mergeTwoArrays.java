package Arrays;

import java.util.Arrays;

public class mergeTwoArrays {
public static void main(String[] args) {
	int[] a = {10,20,30};
	int[] b = {40,50,60};
	
	System.out.println(Arrays.toString(merge(a,b)));
	
}

public static int[] merge(int[] a, int[] b)
{
	int[] c = new int[a.length+b.length];
	int j = 0;
	for(int i=0;i<c.length;i++)
	{
		if(i<a.length) 
		{ 
			c[i] =a[i]; 
		} 
		else
		{ 
			c[i]=b[j]; 
			j++; 
		}
	}
	return c;
}
}
