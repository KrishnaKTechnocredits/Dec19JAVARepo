//sum of elements of an array of size having N

package sonali1297;

public class Assignment1_Q3 {

	public static void main(String[] args) 
    {
		
		int[] array = {1,5,6,7,12,25,300,1000};
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++)
		{
		
			sum = array[i] + sum;
		}
			
			System.out.println("Sum of all array numbers is:" +sum);
			
		}
	}
