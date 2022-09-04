package week1.day2;

public class Week1_Day2_Assign4_RemoveDuplicates {

	public static void main(String[] args) {
		
		// 1. Use the declared String text as input
	
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("Original text = "+ text);
		// 2. Initialize an integer variable as count
		int count=0;
		
		// 3. Split the String into array and iterate over it 
		String s1[]=text.split("\\s");
				
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!=null)
			{
		// 4. Initialize another loop to check whether the word is there in the array
				for(int j=i+1;j<s1.length;j++)
				{
					if(s1[i].equals(s1[j]))
					{
						count++;
		
		// 5. if the count >= 1 then replace the word as "" 
						if(count>=1)
						{
							s1[j]=null;
						}
					}
				}
			}
		}
		
		// 6. Displaying the String without duplicate words
		for(int k=0;k<s1.length;k++)
		{
			if(s1[k]!=null)
			System.out.print(s1[k]+ "  " );
		}
		
	}

}


