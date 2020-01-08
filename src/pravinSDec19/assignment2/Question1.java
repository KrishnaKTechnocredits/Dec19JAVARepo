package pravinSDec19.assignment2;

/*
 * Created by : Pravin Sarda
 * Assignment 2 : Question 1
 * 
 * Find the missing number in integer array of 1 to 10?
	Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing, 
	you need to write a Java program to find that missing number in an array.
*/

public class Question1 {
	
	int findMissingNumber(int[] numArray) {

		boolean flag=false;
		int missingNumber=0;
		int j=0;
		for(int i=1; i<=10;i++) {
	
			for(j=0; j<numArray.length;j++) {
					int value = numArray[j];
					
					if(value==i) {
						flag=true;
						break;					
					}else {
						flag=false;					
					}
					
			}
			if(flag==false)
					missingNumber=i;
		}
		return missingNumber;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question1 find = new Question1();
		
		int numArray[] = {4,1,3,7,9,10,2,6,8};
		
		System.out.println("Missing number in an array is "+find.findMissingNumber(numArray));
		
		
	}

}
