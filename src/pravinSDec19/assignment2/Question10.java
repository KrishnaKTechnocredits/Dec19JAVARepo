package pravinSDec19.assignment2;

/*
 * Created by : Pravin Sarda
 * Assignment 2 : Question 10
 * 
	Find max value at differed index
	i/p:- arr1: {10,2,9,14,3}
	arr2: {10,2,18,14,3}
	o/p :- Values are not matching at index -> 2
	From (9,18) max value is 18
*/

public class Question10 {
	
	void findMaxNumOfDifferIndex(int[] numArray1, int[] numArray2) {

		for(int i=0;i<numArray1.length; i++) {
			
			if(numArray1[i]!=numArray2[i]) {
				
				if(numArray1[i]>numArray2[i])
					System.out.println("Values are not matching at index ->"+i+" From ("+numArray1[i]+","+numArray2[i]+") max value is "+numArray1[i]);
				else
					System.out.println("Values are not matching at index ->"+i+" From ("+numArray1[i]+","+numArray2[i]+") max value is "+numArray2[i]);
				
			}
	
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question10 find = new Question10();
		
		int numArray1[] = {4,16,5,10,19};
		int numArray2[] = {4,23,5,10,18};
		find.findMaxNumOfDifferIndex(numArray1, numArray2);
		
	}

}
