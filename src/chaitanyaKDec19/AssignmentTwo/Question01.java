package chaitanyaKDec19.AssignmentTwo;

public class Question01 {

	void displayMissingNum(int[] intArr) {

		int total = (intArr.length + 1) * (intArr.length + 2) / 2;

		for (int i = 0; i < intArr.length; i++) {
			total = total - intArr[i];
		}

		System.out.println("Missing number from the given array is: " + total);

	}

}

// Logic copied from Internet