package pravinSDec19.assignment1;
/*
	You are given a String s. Count the number of occurrences of all the digits in the Integer number.
	Input: 128896
	Output: 1 -> 1, 2 -> 1, 6 -> 1, 8 -> 2, 9 -> 1
	Approach: First think you will write on method which check whether this number is come for first time or not. If number come for the first time then you
 */
public class Question9 {
	
	static void displayOccurance(String str) {
		
		char digit;
		for(int j=0; j<str.length();j++) {
		int count = 0;
			digit = str.charAt(j);
			if (j==str.indexOf(digit)) {
			for(int i=0; i<str.length(); i++) {
				
				if(str.charAt(i) == digit) 
					count++;
						
			}	
			
			System.out.println("Frequency of "+digit+" is "+count);
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "128896";
		displayOccurance(str);
		
		
	}

}
