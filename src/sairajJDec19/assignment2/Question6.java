package sairajJDec19.assignment2;
//check if arrays are equal
public class Question6 {
	
	void checkArrayEqual(int[] a, int[]b) {
		
		boolean flag = true;
		for(int i = 0; i<a.length;i++) {
			for(int j = i; j<b.length; j++) {
				if(a[i]!=b[j]) {
				flag = false;	
				}else {
					i++;
				}
			}
		}
		if(flag == false) {
			System.out.println("Two Arrays are not Equal ");
		}else {
			System.out.println("Two Arrays are Equal");
		}
		
	}
	
	public static void main(String[] args) {
			int[]arr = {21,57,11,37,24};
			int[]barr = {21,57,11,37,24};
			Question6 q1 = new Question6();
			q1.checkArrayEqual(arr, barr);
			
		}
}
