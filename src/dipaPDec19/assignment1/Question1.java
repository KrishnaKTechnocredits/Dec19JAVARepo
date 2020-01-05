package dipaPDec19.assignment1;
/*
 * Write a program to print the sum of two integers.
 */
public class Question1 {
	
		int doSum(int a, int b)
		{
			return a+b;
		}
		
		public static void main(String[] args )
		{
			Question1 add = new Question1();
			System.out.println("The Addition is "+add.doSum(2,3));
			
		}
	

}
