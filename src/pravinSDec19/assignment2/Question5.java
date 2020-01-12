package pravinSDec19.assignment2;

/*
 * Created by : Pravin Sarda
 * Assignment 2 : Question 5
 * 
	Write a java program to find second largest element in an array of integers?
*/

public class Question5 {
	
	int findSecLargestNumber(int[] numArray) {

		int tempValue=0;
		
		for(int i=0; i<numArray.length;i++) {
	
			for(int j=i+1; j<numArray.length;j++) {
							
					if(numArray[i] < numArray[j]) {
						
						tempValue = numArray[i];
						numArray[i] = numArray[j];
						numArray[j] = tempValue;
				
					}
			}

		}
		return numArray[1];		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question5 find = new Question5();
		
		int numArray[] = {4,10,5,7,2,8,12};
		
		System.out.println("Second Largest number in given array is "+find.findSecLargestNumber(numArray));
		
		
		
	}

}
