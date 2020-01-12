package sonalPDec19.assignment2;
/*
 * WAP to print common number from two different array 
 * int:- a. int array1 = {1, 3, 6, 9, 7}  and b. int array2 = {2, 5, 6, 9, 8} 
 * output Array :- {6, 9} 
 */

public class Question12 {
	
	static void findCommonNum(int[] input1, int[] input2)
	{
		for(int i=0; i<input1.length; i++)
		{
			for(int j=0; j<input2.length;j++)
			{
				if(input1[i]==input2[j])
				{
					System.out.print(input1[i]+ " ");
					break;
				}
			}
				
		}
	}

	public static void main(String[] args) {
		int[] array1 = {1, 3, 7, 9, 8};
		int[] array2 = {8, 3, 6, 9, 3};
		findCommonNum(array1, array2);
	}
}
