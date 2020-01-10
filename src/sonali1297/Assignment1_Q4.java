//sum of elements of square of an array of size having N

package sonali1297;

public class Assignment1_Q4 {

	public static void main(String[] args) 
    {
		
		int[] array = {4, 7, 2, 8, 5};
		
		int sum = 0;
		
		for( int i = 0; i< array.length; i++)
		{
		
			sum = (array[i]*array[i]) + sum;
		}
			
			System.out.println("Sum of square of all array numbers is:" +sum);
			
		}
}
