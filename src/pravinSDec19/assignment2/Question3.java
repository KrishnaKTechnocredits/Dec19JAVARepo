package pravinSDec19.assignment2;

/*
 * Created by : Pravin Sarda
 * Assignment 2 : Question 3 
	Check if array contains a number in Java?
	Hint: Your method should accept 2 parameters. Input array and number.
	i/p :- arr[] = {2,5,9,7,4,6}
	number :- 8
	o/p :- number is not in arr.
*/
public class Question3 {
	
	void checkNumPresent(int[] numArray, int num) {
		
			boolean flag=false;
			
			for(int i=0; i<numArray.length;i++) {
				
				int value = numArray[i];
				if(num==value)
					flag=true;
								
			}
			if(flag==true){
				
				System.out.println("Number "+num+" is present in given array");
				
			}else {
				
				System.out.println("Number "+num+" is not present in given array");
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question3 present = new Question3();
		
		int numArray[] = {0,3,4,5,6,4,7};
		present.checkNumPresent(numArray,8);
		
	}

}
