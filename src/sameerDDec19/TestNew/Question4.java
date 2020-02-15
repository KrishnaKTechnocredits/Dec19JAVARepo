package sameerDDec19.TestNew;

import java.util.ArrayList;
import java.util.Scanner;

public class Question4 
{
	public static void main(String[] args)
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();
		System.out.println("Enter the string array :");
		String[] arr=new String[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}*/
		String[] s= {"techno","credits","pune"};
		
		display(s);	
	}
	static void display(String[] s)
	{
		ArrayList list=new ArrayList<String>();
		for(int i=0;i<s.length;i++)
		{
			list.add(s[i]);
		}
		System.out.println(list);
	}
	
}


	