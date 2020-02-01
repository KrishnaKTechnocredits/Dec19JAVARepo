/*
 * WAP to find string which has length more than 7characheter.
a. Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”,
”abhishek”}
b. Output :- Krishna, aakansha, abhishek
 */
package anjaliSDec19.Assignment3;

import java.util.Scanner;

public class MoreThan7Char {

	String[] setArray()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lenght of array");
		int len = scan.nextInt();
		String[] str = new String[len];
		for(int i=0; i<len;i++)
		{
			System.out.println("Enter the element : ");
			str[i] = scan.next();
		}
		scan.close();
		return str;
	}
	
	void getArray(String[] str)
	{
		for(int i=0; i<str.length;i++)
		{
			System.out.print(str[i]+"\t");
		}
	}
	void findMax(String[] str)
	{
				for(int i=0;i<str.length;i++)
			{
				if(str[i].length()>=7)
				{
					System.out.print(str[i] + '\t');
				}
			}
		
	}
	public static void main(String[] args) {
		MoreThan7Char obj1 = new MoreThan7Char();
		String[] str = obj1.setArray();
		obj1.findMax(str);
		
	}
}
