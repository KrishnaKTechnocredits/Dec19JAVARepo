package kedarKDec19.Assignment2;

public class Question7 {
	
	/*
	 * Sum of array 
	 * 
	 * 
	 */

	static void sum(int digit,int[] num) {
		
		int num1=0;
		int num2=0;
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(digit==(num[i]+num[j]))
				{
					
					System.out.println(num[i]+","+num[j]);
				
				}
			}
		}
		
	
	}	
		
		
	
	
	public static void main(String[] args) {
		int[] array= {2,4,3,5,7,8,9};
		sum(9,array);
	
	}
	
}
