package rohiniBDec19.GitTest1;

/*Sum of odd and even numbers  [10 20 23 17 40 50 19] */

public class OddEvenSum {
	
	static int osum=0;
	static int esum=0;
	
	static  void findSum(int number)
	{ 
		if(number%2==0)
		{
			osum=osum+number;              //Gives sum of odd numbers
		    
		}
		else
		{
			esum=esum+number;            //Gives sum of Even numbers
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		for(int i=0;i<args.length;i++)
		{
			OddEvenSum.findSum(Integer.parseInt(args[i]));
		}
		System.out.println("Sum of Odd Num: "+osum);
		System.out.println("Sum of Even is: "+esum);
		
		
	}

}
