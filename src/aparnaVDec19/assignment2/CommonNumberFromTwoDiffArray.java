package aparnaVDec19.assignment2;
/*
 * 12) WAP to print common number from two different array
       a. int array1 = {1, 3, 6, 9, 7}
       b. int array2 = {2, 5, 6, 9, 8}
       output Array :- {6, 9}
 */
public class CommonNumberFromTwoDiffArray {
	static void findCommonNumber(int[] number1, int[] number2)
	{ 
		for(int i=0; i<number1.length;i++)
	      {
			  for(int j=0; j<number2.length;j++) 
			 {
			 if (number1[i]==number2[j])
			 {
				 System.out.println(number1[i]);					
			 }
			 }
		  }
	}
	public static void main(String[] args)
	{
		int[] number1={1, 3, 6, 9, 7};
		int[] number2={2, 5, 6, 9, 8};
		findCommonNumber(number1, number2);
	}
}
