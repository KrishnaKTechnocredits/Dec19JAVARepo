package pravinSDec19.assignment2;

/*
 * Created by : Pravin Sarda
 * Assignment 2 : Question 11
 * 
	WAP to print unique number from the two different array
	a. int array1 = {1, 3, 6, 9, 7},
	b. int array2 = {2, 5, 6, 9, 8}
	output Array :- {1, 3, 6, 9, 7, 2, 5, 8}
*/

public class Question11 {
	
	void findUniqueNum(int[] numArray1, int[] numArray2) {

		int uniqueNumArray[] = new int[numArray1.length+numArray2.length];
		int newIndex=0;
		
		for(int i=0;i<numArray1.length; i++) {
			
			if(numArray1[i]!=numArray2[i]) {
				uniqueNumArray[newIndex] = numArray1[i];
				newIndex++;
				uniqueNumArray[newIndex] = numArray2[i];
				newIndex++;
			}
	
		}
		for(int k=0; k<uniqueNumArray.length; k++) {
			
			if(uniqueNumArray[k]!=0)
			System.out.print(uniqueNumArray[k]+" ");
	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question11 find = new Question11();
		
		int numArray1[] = {4,16,5,10,15};
		int numArray2[] = {14,23,5,10,18};
		find.findUniqueNum(numArray1, numArray2);
		
	}

}
