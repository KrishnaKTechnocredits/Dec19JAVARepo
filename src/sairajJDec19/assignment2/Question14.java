package sairajJDec19.assignment2;

public class Question14 {
	
	void evenArrayNum(int[]a) {
		for(int i=0; i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {15,24,52,49,62,10};
		Question14 q1 = new Question14();
		q1.evenArrayNum(arr);
	}

}
