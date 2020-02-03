package sameerDDec19.Assignment3;
import java.util.Scanner;
/*
 * WAP to find max length String from the given array.
	a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
 */
public class Question2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();
		System.out.println("Enter the string array :");
		String[] arr=new String[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		display(arr);
		maxLength(arr);
	}
	static void display(String[] input)
	{
		System.out.println("The given String is");
		for(int i=0;i<input.length;i++)
		{
			System.out.println(input[i]+" ");
		}
		
	}
	static void maxLength(String[] input)
	{
		int maxLength=0;
		String largeString=null;
		for(int i=0;i<input.length;i++)
		{
			if(input[i].length()>maxLength)
			{
				maxLength=input[i].length();
				largeString=input[i];
			}
		}
		System.out.println("The maximum length is "+maxLength);
		System.out.println("The large String is "+largeString);
	}
}






