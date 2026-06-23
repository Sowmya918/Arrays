package Arrays;

public class evenElements {
public static void main(String[] args) {
	int[] a = {2,3,68,31,85,42};
	
	for(int i = 0;i<a.length; i++)
	{
		if(a[i]%2==0)
			System.out.println(a[i]);
	}
}
}
