package Arrays;

import java.util.HashSet;

public class RemoveDuplicateUsingHashmap {

	public static void main(String[] args) {
		int[] a= {10,20,10,20,30};
		System.out.println(removeDuplicate(a));
	}
	public static HashSet removeDuplicate(int[] a)
	{
		HashSet<Integer> hashSet = new HashSet<>();
		for(int i:a)
		{
			hashSet.add(i);
		}
		return hashSet;
	}
}
