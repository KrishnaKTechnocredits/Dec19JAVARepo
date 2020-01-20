package pravinSDec19.assignment2;

/*
 * Created by : Pravin Sarda
 * Assignment 2 : Question 7
 * 
	Find all pairs on integer array whose sum is equal to given number?
	Hint: You have given an integer array and a number, 
	you need to write a program to find all elements in the array whose sum is equal to the given number.
	Remember, the array may contain both positive and negative numbers, 
	so your solution should consider that. 
	Input:2, 4, 3, 5, 7, 8, 9
	Given sum:7 Integer numbers, whose sum is equal to value:7 (2, 5) (4, 3)
*/

public class Question7 {

	void findFirstDifferIndex(int[] numArray, int sum) {

		System.out.print("Integer numbers, whose sum is equal to value: " + sum + " are ");

		for (int i = 0; i < numArray.length; i++) {

			int Value1 = numArray[i];
			for (int j = i + 1; j < numArray.length; j++) {

				int Value2 = numArray[j];
				if ((Value1 + Value2) == sum)
					System.out.print("(" + Value1 + "," + Value2 + ") ");
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question7 find = new Question7();

		int numArray[] = { 1, -1, 2, 3, 5, 6, 8, 10 };
		int sum = 9;
		find.findFirstDifferIndex(numArray, sum);

	}

}
