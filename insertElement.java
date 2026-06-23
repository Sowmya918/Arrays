package Arrays;

import java.util.Arrays;

public class insertElement {

	public static void main(String[] args) {
		int[] a = {1,2,3,5,7};
		int[] b = new int[a.length+1];
		
		int index = 2,item=70;
		
		int j=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(index==i)
			{
				b[j]=item;
				j++;
			}
			b[j]=a[i];
			j++;
		}
		System.out.println(Arrays.toString(b));
		
	}
}
