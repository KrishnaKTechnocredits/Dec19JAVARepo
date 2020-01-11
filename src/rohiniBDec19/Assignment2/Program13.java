package rohiniBDec19.Assignment2;

/*13) WAP to reveres array */

public class Program13 {
	
	 static void reverseAnArray(int[] num)
		{
			for(int i=num.length-1;i>=0; i--)
			{
				System.out.print(num[i]+"\t");		
			}
			
		}
		public static void main(String[] args) { 
			int number[] ={100,1,3,80,66,9};
			reverseAnArray(number);		
		}
	
}

