package pravinSDec19.assignment2;

/*
 * Created by : Pravin Sarda
 * Assignment 2 : Question 6
 * 
	Write a java program to check the equality of two arrays?
	Hint: Input Arrays : First Array : [21, 57, 11, 37, 24] 
	Second Array : [21, 57, 11, 37, 24] Two Arrays Are Equal
*/

public class Question6 {
	
	void checkEqalityOfTwoArrays(int[] numArray1, int[] numArray2) {

		boolean flag = false;
		for(int i=0;i<numArray1.length; i++) {
			
			if(numArray1[i]!=numArray2[i]) {
				flag=false;
				break;
			}
			else
				flag=true;
	
		}
		if(flag)
			System.out.println("Given Two Arrays Are Equal");
		else
			System.out.println("Given Two Arrays Are Not Equal");
			
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question6 check = new Question6();
		
		int numArray1[] = {4,16,5,10,18};
		int numArray2[] = {4,16,5,10,18};
		check.checkEqalityOfTwoArrays(numArray1, numArray2);
		
	}

}
