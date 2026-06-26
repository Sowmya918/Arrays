package Arrays;

public class LinearSearch {
public static void main(String[] args) {
	int[] a= {10,20,30,15,70};
	int ele=60;
	System.out.println(isSearch(a,ele));
}

public static String isSearch(int[] a, int ele)
{
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==ele)
			return "Element is Found";
	}
	return "Element is  not Found";
}
}
