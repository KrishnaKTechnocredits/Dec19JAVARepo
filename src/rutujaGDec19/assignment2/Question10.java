package rutujaGDec19.assignment2;
/*
 * 8. to find difffer index from given array
 * 9. to find all differ index from given array
 * 10.find max value at different array
 * Question 8,9,10 together */
public class Question10 {
	void checkIndex(int[] a1 , int[] a2) {
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] != a2[i]) {
				System.out.println("Value not matching at index : "+i);
				if(a1[i] > a2[i])
					System.out.println("Greater one is : "+a1[i]);
				else
					System.out.println("Greater one is : "+a2[i]);
			}
			
		}
	}
	public static void main(String[] args) {
		int[] a1 = {10 , 2 , 9 , 14 , 3};
		int[] a2 = {10 , 2 , 12 , 14 , 13};
		Question10 q = new Question10();
		q.checkIndex(a1, a2);
	}
		
}
