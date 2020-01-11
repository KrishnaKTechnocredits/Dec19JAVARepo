package rohiniBDec19.GitTest1;

/*Sum of odd and even numbers*/

public class OddEvenSum {
	
	static int osum=0;
	static int esum=0;
	
	static  void findSum(int n)
	{ 
		if(n%2==0)
		{
			osum=osum+n;              //Gives sum of odd numbers
		    
		}
		else
		{
			esum=esum+n;            //Gives sum of Even numbers
			
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
