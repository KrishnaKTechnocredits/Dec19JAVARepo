package pravinSDec19.assignment2;

/*
 * Created by : Pravin Sarda
 * Assignment 2 : Question 2
 * 
	Find duplicate number on Integer array in Java?
	Hint: There is exactly one number is repeated in the array. 
	You need to write a program to find that duplicate number. 
	For example, if an array with length 6 contains numbers {0, 3, 1, 2, 3}, 
	then duplicated number is 3.
*/
public class Question2 {
	
	int duplicateNumber(int[] numArray) {
		
			int duplicateNum=0;
			
			for(int i=0; i<numArray.length;i++) {
					int count=0;
					int value = numArray[i];
					
					for(int j=1; j<numArray.length;j++) {
						
						if(value==numArray[j])
							count++;
					}
					if(count>1)
						duplicateNum=value;
		}
		return duplicateNum;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question2 duplicate = new Question2();
		
		int numArray[] = {0,3,4,5,6,4,7};
		
		System.out.println("Duplicate number in an array is "+duplicate.duplicateNumber(numArray));
		
		
	}

}
