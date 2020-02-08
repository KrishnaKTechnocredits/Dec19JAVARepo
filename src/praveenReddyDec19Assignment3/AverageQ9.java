package praveenReddyDec19Assignment3;
/*
 WAP to find average of user given array 
 a. Input :- {14, 32, 19, 14, 78,36} 
 b. Output:- 32.16 
 */

public class AverageQ9 {
	static void AverageOfNumber(int[] number) {
		double avg;
		int sum = 0;
		int lengthofnumber = number.length;
		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i];

		}
		avg = sum / lengthofnumber;
		System.out.println("average of user given array : " + avg);

	}

	public static void main(String[] args) {
		int number[] = { 14, 32, 19, 14, 78, 36 };
		AverageQ9.AverageOfNumber(number);
	}

}
