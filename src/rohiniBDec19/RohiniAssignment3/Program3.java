package rohiniBDec19.RohiniAssignment3;

import java.util.Scanner;

/*WAP to find frequency of given char in given string*/
public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Enter element to compare");
		String ch=sc.next();
		
		findFrequency(str,ch);
	}

	private static void findFrequency(String str, String ch) {
		int count=0;
		for(int i=0;i<str.length();i++)
		{
		if(String.valueOf(str.charAt(i)).equalsIgnoreCase(ch)) //To Compare character converted to string
		{
			count++;
		}
		}
		
		System.out.println("Frequency of charcter "+ch+" is: "+count);
		
	}
}
