/*
 * 1.	Write a program to create String array and store atleast five names of your friends and print using enhanced forloop.
 */
package anjaliSDec19.Assignment4.Array;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] str=new String[5];
		System.out.println("Enter names of atleast 5 friends : ");
		for(int i=0;i<5;i++)
		{
			 str[i]=scan.next();
		}
		System.out.println("Entered names are : ");
		for(String s1:str)
		{
			System.out.println(s1);
		}
		scan.close();
	}
}
