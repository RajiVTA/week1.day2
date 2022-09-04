package week1.day2;

public class Week1_Day2_Assign3_Palindrome {

	public static void main(String[] args) {
	
		// 1. Declare A String value as"madam"
		
		String s="madam";
		System.out.println("Original String is = " + s);
		
		// 2. Declare another String rev value as ""
		String rev="";
		
		int len=s.length();
		
		// 3. Iterate over the String in reverse order
		
		for(int i=len-1;i>=0;i--)
		{
		
		// 4. Add the char into rev
			rev=rev+s.charAt(i);
		}
		System.out.println("The reverse of the string is = " + rev);
		
		/* 5. Compare the original String with the reversed String
		      if it is same then print palinDrome */
		if (s.equals(rev))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is NOT a Palindrome");
	}

}
