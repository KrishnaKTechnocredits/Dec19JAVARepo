package sairajJDec19.assignment2;

public class Question9 {
	
	void allDiffer(int[]a, int[]b) {
			for(int i = 0; i<a.length;i++) {
				for(int j = i; j<b.length; j++) {
					if(a[i]!=b[j]) {
					System.out.println("Valuse not matching at index -> " + i);
					break;
					}else {
						i++;
					}
				}
			}
		}
	
	public static void main(String[] args) {
		int[] arr = {10,2,9,14,3};
		int[] barr ={10,2,18,14,13};
		Question9 q1 = new Question9();
		q1.allDiffer(arr, barr);
	}
}
