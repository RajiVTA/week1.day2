package week1.day2;

public class Week1_Day2_Assign2_FindIntersection {

	public static void main(String[] args) {
		
		// 1. Declare An array for {3,2,11,4,6,7};
		int num1[]= {3,2,11,4,6,7};	
		
		// 2. Declare another array for {1,2,8,4,9,7};
		int num2[]= {1,2,8,4,9,7};
		
		int l1=num1.length;
		int l2=num2.length;
		
		// 3. Declare for loop iterator from 0 to array length
		for(int i=0;i<l1;i++)
		{
		// 4. Declare a nested for another array from 0 to array length
			for(int j=0;j<l2;j++)
			{
		// 5. Compare Both the arrays using a condition statement
				if(num1[i]==num2[j])
				{
		// 6. Print the first array (should match item in both arrays)
				System.out.print( num1[i]  +  "  " );
				break;
				}
			}
		}

	}

}

