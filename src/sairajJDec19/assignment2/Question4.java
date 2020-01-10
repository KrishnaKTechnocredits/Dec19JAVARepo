package sairajJDec19.assignment2;

public class Question4 {
	
	void prinMinMax(int[]a) {
		
		int min = 0;
		int max = 0;
		
		for(int i = 1; i<a.length;i++) {
			min = a[0];
			if(a[i]<min) {
				min = a[i];
				break;
			}
		}
		
		for(int i = 1; i<a.length;i++) {
			max = a[0];
			if(a[i]>max) {
				max = a[i];
				break;
			}
		}
		
		System.out.println("The minimum number in array is: " + min);
		System.out.println("The maximum number in array is: " + max);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {11, 22, 3, 8, 9, 14};
		Question4 q1 = new Question4();
		q1.prinMinMax(arr);
		
	}

}