package sameerDDec19.Assignment3;

import java.util.Scanner;
/*WAP to find reverse max length string
	a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
	b. Output Max length string :- Technocredits
	c. Max length string reverse value :- stiderconhcet
 */
public class Question6
{
	static int maxLength=0;
	static String largeString=null;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();
		System.out.println("Enter the String Array :");
		String[] arr=new String[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		//display(arr);
		maxLength(arr);
		reverce(arr);
	}
	static void display(String[] input)
	{
		System.out.print("The given string array is :");
		for(int i=0;i<input.length;i++)
		{
			System.out.print(input[i] + " ");	
		}
	}
	static void maxLength(String[] input)
	{
		
		for(int i=0;i<input.length;i++)
		{
			if(input[i].length()>maxLength)
			{
				maxLength=input[i].length();
				largeString=input[i];	
			}
		}
		System.out.println("Large String is :" +largeString);
		System.out.println("Large String Max Size is :" +maxLength);	
	}
	static void reverce(String[] input)
	{
		System.out.println("Reverce String is :");
		{
			for(int i=largeString.length()-1;i>=0;i--)
			{
				char ch=largeString.charAt(i);
				System.out.print(ch);
			}
		}
	}
}




