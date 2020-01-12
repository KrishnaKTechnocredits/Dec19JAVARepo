package pravinSDec19.assignment2;

/*
 * Created by : Pravin Sarda
 * Assignment 2 : Question 8
 * 
	Find all differ index from given arrays
	i/p :- arr1: {10,2,9,14,3}
	arr2: {10,2,18,14,13}
	o/p :- Values are not matching at index -> 2
	Values are not matching at index -> 4
*/

public class Question8 {
	
	void findFirstDifferIndex(int[] numArray1, int[] numArray2) {

		for(int i=0;i<numArray1.length; i++) {
			
			if(numArray1[i]!=numArray2[i]) { 
				System.out.println("Values are not matching at First index ->"+i+" From ("+numArray1[i]+","+numArray2[i]+")");
				break;
			}
	
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question8 find = new Question8();
		
		int numArray1[] = {4,16,5,10,19};
		int numArray2[] = {4,23,5,10,18};
		find.findFirstDifferIndex(numArray1, numArray2);
		
	}

}
