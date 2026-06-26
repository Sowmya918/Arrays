package Arrays;

public class RemoveDuplicate {
public static void main(String[] args) {
	int[] a = {10,20,10,20,30};
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j] && a[i]!=Integer.MAX_VALUE)
				a[j]=Integer.MAX_VALUE;
		}
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]!=Integer.MAX_VALUE)
			System.out.println(a[i]);
	}
}
}
