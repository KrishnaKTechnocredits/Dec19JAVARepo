package yashashrikDec19.Assignment2;
/*3) Check if array contains a number in Java?
Hint: Your method should accept 2 parameters. Input array and number.
i/p :- arr[] = {2,5,9,7,4,6}
number :- 8
o/p :- number is not in arr*/

public class InputNumQ3 {
	void displayNum(int digit,int[] num)
	{
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
		InputNumQ3 input=new InputNumQ3();
		int[] arr= {2,5,9,7,4,6};
		input.displayNum(8, arr);
	}

}
