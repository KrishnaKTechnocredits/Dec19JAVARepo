package chaitanyaKDec19.AssignmentThree;

public class Question09 {

	void displayAverage(int[] numArr) {

		double avg;
		double sum = 0.0;

		for (int i = 0; i < numArr.length; i++) {
			sum = sum + numArr[i];
		}

		avg = sum / numArr.length;

		System.out.println("Average of numbers from given array is: " + avg);

	}

}
