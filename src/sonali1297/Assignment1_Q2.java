//sum of elements of an array size 4

package sonali1297;

public class Assignment1_Q2 {

	public static void main(String[] args)
	{
	
	int[] array = {7,8,9,4};
	
	int sum = 0;
	
	for (int i = 0; i < array.length; i++)
		
	{
	
		sum = array[i] + sum;
	}
		
		System.out.println("Sum of all array numbers is:" +sum);
		
	}

}
