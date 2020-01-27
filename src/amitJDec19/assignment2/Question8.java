package amitJDec19.assignment2;
/*
 * Find first differ index from given arrays
 * i/p :- arr1: {10,2,9,14,3}
 * 		  arr2: {10,2,18,14,3}
 * o/p :- Values are not matching at index -> 2
 */
public class Question8 {
	void findFirstDifferIndex(int[] num1, int[] num2)
	{
		for(int i=0; i<num1.length; i++)
		{
			if(num1[i] != num2[i])
			{
				System.out.println("Values are not matching at index: "+i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Question8 m1=new Question8();
		int[] num1 = {10,2,9,14,3};
		int[] num2 = {10,2,18,14,3};
		m1.findFirstDifferIndex(num1, num2);
	}
}