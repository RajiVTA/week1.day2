package week1.day2;

public class Week1_Day2_Assign1_ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
	
		// 1. Define Strings 
		
		String test = "changeme";
		String result="";
		System.out.println("Original String is =  " + test);
		
		// 2. Convert the String to character array
		
		char[] charArray = test.toCharArray();
		
		int l=charArray.length;
		
		//3. Traverse through each character (using loop)
		
		for(int i=0;i<l;i++)
		{
		
		// 4. within the loop, change the character to Uppercase, if the index is odd else don't change
			
			if(i%2!=0)
			{
				 result=result + Character.toUpperCase(test.charAt(i));
			}
			else
				result=result+test.charAt(i);
		}
		
		System.out.println("ChangeOddIndexToUpperCase String is  = "  + result);
	}

}
