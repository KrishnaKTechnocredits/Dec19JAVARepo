package chaitanyaKDec19.AssignmentTwo;

/*
 * Check if array contains a number in Java
 */

public class Question3 {

	void checkNumberInArr(int[] numArr, int num) {

		Boolean flag = true;

		for (int i = 0; i < numArr.length; i++) {

			if (numArr[i] == num)
				flag = true;
			else
				flag = false;
		}

		if (flag)
			System.out.println("The given number " + num + " is present in given number string");
		else
			System.out.println("The given number " + num + " is NOT present in given number string");
	}

}
