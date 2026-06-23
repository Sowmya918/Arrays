package Arrays;

public class chracterArrayPalindrone {

	public static void main(String[] args) {
		char[] ch = {'m','a','d','a','m'};
		System.out.println(ch);
		System.out.println(isPalindrome(ch));
		
		
	}
	public static String isPalindrome(char[] ch)
	{
		int st=0,end=ch.length-1;
		while(st<end)
		{
			if(ch[st]!=ch[end])
				return "Given array is not palindrome";
			else
				st++;
			    end--;
		}
		        return "Given array is palindrome";
	}
}
