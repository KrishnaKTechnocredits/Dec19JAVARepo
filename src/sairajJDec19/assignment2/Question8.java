package sairajJDec19.assignment2;

public class Question8 {
		void firstDiffer(int[]a, int[]b) {
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
			int[] barr ={10,2,18,14,3};
			Question8 q1 = new Question8();
			q1.firstDiffer(arr, barr);
		}
}
