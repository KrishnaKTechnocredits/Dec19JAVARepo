package pravinSDec19.assignment2;

/*
 * Created by : Pravin Sarda
 * Assignment 2 : Question 12
 * 
		WAP to print common number from two different array
		a. int array1 = {1, 3, 6, 9, 7}
		b. int array2 = {2, 5, 6, 9, 8}
		output Array :- {6, 9}
*/

public class Question12 {
	
	void findCommonNum(int[] numArray1, int[] numArray2) {

		int commonNumArray[] = new int[numArray1.length];
		int newIndex=0;
		
		for(int i=0;i<=numArray1.length-1; i++) {
			
			if(numArray1[i]==numArray2[i]) {
				commonNumArray[newIndex] = numArray1[i];
				newIndex++;
			}
	
		}
		for(int k=0; k<commonNumArray.length; k++) {
			
			if(commonNumArray[k]!=0)
			System.out.print(commonNumArray[k]+" ");
	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question12 find = new Question12();
		
		int numArray1[] = {4,16,5,10,15};
		int numArray2[] = {14,23,5,10,18};
		find.findCommonNum(numArray1, numArray2);
		
	}

}
