package pravinSDec19.assignment2;

/*
 * Created by : Pravin Sarda
 * Assignment 2 : Question 13
 * 
	 WAP to reveres array
	a. int inputArray = {5, 6, 9, 10, 14, 63}
	b. outputArray = {63, 14, 10, 9, 6, 5}
*/

public class Question13 {
	
	void reverseArray(int[] numArray) {

		int revNumArray[] = new int[numArray.length];
		int newIndex=0;
		
		for(int i=numArray.length-1; i>=0; i--) {
			
			revNumArray[newIndex] = numArray[i];
			newIndex++;
	
		}
		for(int j=0; j<revNumArray.length; j++) {
			
			System.out.print(revNumArray[j]+" ");
	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question13 rev = new Question13();
		
		int numArray[] = {4,1,5,7,9,10,2,6,8};
		rev.reverseArray(numArray);
		
	}

}
