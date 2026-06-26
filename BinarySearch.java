package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an element to search: ");
	int ele = sc.nextInt();
	int[] a= {10,30,24,65,32};
	Arrays.sort(a);
	System.out.println(isSearch(a,ele));
}
public static String isSearch(int[] a,int ele)
{
	int st=0,end=a.length-1;
	while(st<=end) {
		int mid = (st+end)/2;
		if(ele==a[mid])
			return "Element is found";
		else if(ele>a[mid])
			st=mid+1;
		else if(ele<a[mid])
			end=mid-1;
	}
	return "Element is not Found";
}
}
