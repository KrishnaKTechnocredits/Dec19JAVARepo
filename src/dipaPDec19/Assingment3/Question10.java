package dipaPDec19.Assingment3;

/*
 * WAP to sum of two array
	a. firstArray :- {1, 5, 9, 3, 7}
	b. secondAraay:- {1, 7, 9, 3}
	c. output :- 45
 */
public class Question10 {
	public static void main(String[] args) {
		Question10 que10 = new Question10();
		int[] array1 = { 1, 5, 9, 3, 7 };
		int[] array2 = { 1, 7, 9, 3 };
		que10.getArraySum(array1, array2);
	}

	void getArraySum(int[] arrayA, int[] arrayB) {
		int sumA = 0;
		int sumB = 0;
		// int sum = 0;
		// int arrayC = arrayA + arrayB;
		for (int i = 0; i < arrayA.length; i++) // Addition of all elements of firstarray
		{
			sumA = sumA + arrayA[i];

		}
		for (int i = 0; i < arrayB.length; i++) // Addition of all elements of secondarray
		{
			sumB = sumB + arrayB[i];
		}
		System.out.println(sumA + sumB);
	}

}
