package swatiShinde30.assignment3;
/*
 * WAP to find average of user given array 
 */
import java.util.Scanner;

public class Question9 
{
	static int avg, sum;

	static void average(int[] array) 
	{
		for (int i = 0; i < array.length; i++) 
		{
			sum = sum + array[i];
		}
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = s.nextInt();
		int[] array = new int[size];
		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) 
		{
			array[i] = s.nextInt();

		}
		average(array);
		avg = sum / size;
		System.out.println(avg);
	}
}
