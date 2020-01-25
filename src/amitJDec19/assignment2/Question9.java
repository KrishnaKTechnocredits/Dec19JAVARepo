package amitJDec19.assignment2;
/*
 * Find all differ index from given arrays
 * i/p :- arr1: {10,2,9,14,3}
 *        arr2: {10,2,18,14,13}
 * o/p :- Values are not matching at index -> 2
 * 		  Values are not matching at index -> 4
 */
public class Question9 {
	void findAllDifferIndex(int[] num1, int[] num2)
	{
		for(int i=0; i<num1.length; i++)
		{
			if(num1[i] != num2[i])
			{
				System.out.println("Values are not matching at index -> "+i);
			}
		}
	}
	public static void main(String[] args) {
		Question9 m1=new Question9();
		int[] num1 = {10,2,9,14,3};
		int[] num2 = {10,2,18,14,13};
		m1.findAllDifferIndex(num1, num2);
	}

}