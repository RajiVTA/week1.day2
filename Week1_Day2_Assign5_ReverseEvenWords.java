package week1.day2;

public class Week1_Day2_Assign5_ReverseEvenWords {

	public static void main(String[] args) {
		
		// 1. Declare the input as Follow
		String test = "I am a software tester";
		System.out.println("Original text is = " + test);
		
		// 2. split the words and have it in an array
		String split_test[]=test.split("\\s");
		String reverse_test="";
		
		// 3. Traverse through each word (using loop)
		for(int i=0;i<split_test.length;i++)
		{
		
		// 4. find the odd index within the loop (use mod operator)
			if(i%2!=0)
			{
				String single_word=split_test[i];
				String reverse_word="";
		// 5. print the even position words in reverse order using another loop (nested loop)
				for(int j=single_word.length()-1;j>=0;j--)
				{
					reverse_word=reverse_word+single_word.charAt(j);
				
				}
					reverse_test=reverse_test+reverse_word+"   ";
			}
			else
				reverse_test=reverse_test+ split_test[i]+"   ";
				
		}
		System.out.println(reverse_test);
	}
}
			
			
			
			
			
			
			
			
			
			
			
		