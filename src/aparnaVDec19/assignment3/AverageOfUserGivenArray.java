package aparnaVDec19.assignment3;

/*
 * 9) WAP to find average of user given array
      a. Input :- {14, 32, 19, 14, 78,36}
      b. Output:- 32.16
 */
public class AverageOfUserGivenArray {

	static void averageOfArray(double[] arr) {
		double total = 0;
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		double average = total / arr.length;
		System.out.format("The average of Given Number Array is: > " + average);
	}

	public static void main(String[] args) {
		double arr[] = { 14, 32, 19, 14, 78, 36 };
		averageOfArray(arr);
	}
}
