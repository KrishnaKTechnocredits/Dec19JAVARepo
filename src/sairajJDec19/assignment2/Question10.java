package sairajJDec19.assignment2;

public class Question10 {
	
	void maxAtDiffer(int[]a, int[]b) {
		
		for(int i = 0; i<a.length;i++) {
			for(int j = i; j<b.length; j++) {
				if(a[i]!=b[j]) {
				if(a[i]>b[j]) {
					System.out.println("From ("+a[i]+","+b[j]+ " ) max value is: "+ a[i]);
				}else {
					System.out.println("From ("+a[i]+","+b[j]+") max value is: "+ b[j]);
				}
				break;
				}else {
					i++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10,2,9,14,3};
		int[] barr ={10,2,18,14,3};
		Question10 q1 = new Question10();
		q1.maxAtDiffer(arr, barr);
	}
}
