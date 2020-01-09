package sairajJDec19.assignment2;

public class Question7 {
	
	void findPairs(int[] a, int sum) {

		for(int i =0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]+a[j] == sum) {
					System.out.println("("+ a[i] +"," + a[j] + ")");
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int [] arr = {2,4,3,5,7,8,9};
		int sum = 7;
		Question7 q1 = new Question7();
		q1.findPairs(arr, sum);
	}
}
