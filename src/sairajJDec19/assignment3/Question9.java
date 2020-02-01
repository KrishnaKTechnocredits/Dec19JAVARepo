package sairajJDec19.assignment3;

public class Question9 {
	double getAverage(double[] a) {
		double average = 0;
		double sum = 0;
		for(int i=0; i<a.length;i++) {
			sum += a[i];
		}
		
		average = sum/a.length;
		
		return average;
	}
	
	public static void main(String[] args) {
		double[] arr = {14, 32, 19, 14, 78, 36};
		Question9 q1 = new Question9();
		System.out.println(q1.getAverage(arr));//sd
		
	}
}
