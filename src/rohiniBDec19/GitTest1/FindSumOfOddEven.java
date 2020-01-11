package rohiniBDec19.GitTest1;

/*Sum of odd and even numbers  [10 20 23 17 40 50 19] */


public class FindSumOfOddEven {


	
	static int oddsum=0;
	static int evensum=0;
	
	static  void findSum(int number)
	{ 
		if(number%2==0)
		{
			oddsum=oddsum+number;              //Gives sum of odd numbers
		    
		}
		else
		{
			evensum=evensum+number;            //Gives sum of Even numbers
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		for(int i=0;i<args.length;i++)
		{
			FindSumOfOddEven.findSum(Integer.parseInt(args[i]));
		}
		System.out.println("Sum of Odd Numbers is: "+oddsum);
		System.out.println("Sum of Even Numbers is: "+evensum);
		
		
	}
}
