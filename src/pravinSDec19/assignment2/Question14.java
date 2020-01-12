package pravinSDec19.assignment2;

/*
 * Created by : Pravin Sarda
 * Assignment 2 : Question 14
 * 
	WAP to print even number from the array
	int a = {15, 24, 52, 49, 62, 10};
	output :- {24, 52, 62, 10}
*/

public class Question14 {
	
	void findEvenNum(int[] numArray) {

		int evenNumArray[] = new int[numArray.length];
		int newIndex=0;
		
		for(int i=0;i<=numArray.length-1; i++) {
			
			if(numArray[i]%2==0) {
			evenNumArray[newIndex] = numArray[i];
			newIndex++;
			}
	
		}
		for(int j=0; j<evenNumArray.length; j++) {
			
			if(evenNumArray[j]!=0)
			System.out.print(evenNumArray[j]+" ");
	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question14 find = new Question14();
		
		int numArray[] = {4,16,5,10,2,19,8};
		find.findEvenNum(numArray);
		
	}

}
