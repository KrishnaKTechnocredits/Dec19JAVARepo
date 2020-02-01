/*
 * WAP to find max length String from the given array.
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
 */
package anjaliSDec19.Assignment3;

import java.util.Scanner;

public class MaxLen {
	String[] getString()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lenght of the Array: ");
		int len = Integer.parseInt(scan.nextLine());
		String[] str = new String[len];
		for(int i =0; i<str.length; i++)
		{
			System.out.println("Enter the String: ");
			str[i]=scan.nextLine();
		}
		scan.close();
		return str;
	}
	String[] maxLen(String[] str)
	{
		int len=0;
		String maxstr = null;
		String[] str1= new String[2];
		for(int i=0;i<str.length; i++)
		{
			
			if(len<str[i].length())
			{
				len=str[i].length();
				maxstr=str[i];
			}
		}
		str1[0]=String.valueOf(len);
		str1[1]=maxstr;
		return str1;
	}
	public static void main(String[] args) {
		MaxLen m= new MaxLen();
		String[] str = m.maxLen(m.getString());
		System.out.println("Max lenght is "+ str[0]+ '\n'+"Max String is "+ str[1]);
	}

}
