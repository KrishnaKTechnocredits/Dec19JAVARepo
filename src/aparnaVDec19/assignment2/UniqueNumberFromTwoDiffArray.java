package aparnaVDec19.assignment2;
/*
 * 11) WAP to print unique number from the two different array
       a. int array1 = {1, 3, 6, 9, 7},
       b. int array2 = {2, 5, 6, 9, 8}
       output Array :- {1, 3, 7, 2, 5, 8}
 */

public class UniqueNumberFromTwoDiffArray {

	static void findUniqueNumber(int[] number1, int[] number2) {
		boolean unique = false;
		for (int i = 0; i < number1.length; i++) {
			unique = false;
			for (int j = 0; j < number2.length; j++) {
				if (number1[i] == number2[j]) {
					unique = true;
				}
			}
			if (unique != true) {
				System.out.println(number1[i]);
			}
		}
		for (int i = 0; i < number2.length; i++) {
			unique = false;
			for (int j = 0; j < number1.length; j++) {
				if (number2[i] == number1[j]) {
					unique = true;
				}
			}
			if (unique != true) {
				System.out.println(number2[i]);
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Unique Numbers from Two Arrays are:-> ");
		int[] number1 = { 1, 3, 6, 9, 7 };
		int[] number2 = { 2, 5, 6, 9, 8 };

		findUniqueNumber(number1, number2);
	}
}
