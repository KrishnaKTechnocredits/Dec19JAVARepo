package chaitanyaKDec19.AssignmentThree;

public class Question09 {

	void displayAverage(int[] numArr) {

		double avg;
		double sum = 0.0;

		// getting sum of all integers from given array
		for (int i = 0; i < numArr.length; i++) {
			sum = sum + numArr[i];
		}

		// calculating the average
		avg = sum / numArr.length;

		// displaying the average
		System.out.println("Average of numbers from given array is: " + avg);

	}

}
