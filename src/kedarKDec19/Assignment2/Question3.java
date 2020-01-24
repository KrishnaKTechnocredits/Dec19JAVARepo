package kedarKDec19.Assignment2;

public class Question3 {
	/*
	 * Check if array contains a number in Java?
	Hint: Your method should accept 2 parameters. Input array and number.
	i/p :- arr[] = {2,5,9,7,4,6}
	number :- 8
		o/p :- number is not in arr
	 * 
	 * 
	 */
	
	
	static void Num(int digit,int[] num) {
		String flag="Y";
		for(int i=0;i<num.length;i++)
		{
			
			if(digit==num[i])
			{
				System.out.println("Number present in array"); 
				flag="N";
			}
						
			
		}
		if(flag=="Y")
		{
			System.out.println("Number not present in array");
		}
	}
	
	
	
	
	public static void main(String[] args) {

		int[] arr= {2,5,9,7,4,6};
		Num(8, arr);
	}


	}


