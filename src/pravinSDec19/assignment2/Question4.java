package pravinSDec19.assignment2;

/*
 * Created by : Pravin Sarda
 * Assignment 2 : Question 4
 * 
	Largest and smallest number in unsorted array?
	Hint: For example, if input integer array is {2, 6, 3, 9, 11} 
	and output should be Largest 11 and Smallest 2.
*/

public class Question4 {
	
	int findLargestNumber(int[] numArray) {

		int maxValue= numArray[0];
		for(int i=1; i<numArray.length;i++) {
			
			if(maxValue<numArray[i])
				maxValue=numArray[i];
		}
			return maxValue;		
	}

	int findSmallestNumber(int[] numArray) {

		int minValue= numArray[0];
		for(int i=1; i<numArray.length;i++) {
			
			if(minValue>numArray[i])
				minValue=numArray[i];
		}
			return minValue;		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question4 find = new Question4();
		
		int numArray[] = {4,10,5,7,2,8,12};
		
		System.out.println("Largest number in given array is "+find.findLargestNumber(numArray));
		System.out.println("Smallest number in given array is "+find.findSmallestNumber(numArray));
		
		
	}

}
