/*WAP to find reverse max length string
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
b. Output Max length string :- Technocredits
c. Max length string reverse value :- stiderconhcet

*/
package anjaliSDec19.Assignment3;

import java.util.Scanner;

public class ReverseMaxLen {
	
	String[] setStr()
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
	void getStr(String[] str)
	{
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
	
	String maxLen(String[] str)
	{
		int len=0;
		String maxstr = null;
		
		for(int i=0;i<str.length; i++)
		{
			
			if(len<str[i].length())
			{
				len=str[i].length();
				maxstr=str[i];
			}
		}
		return maxstr;
		 
	}
	void reverseStr(String str)
	{
		
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
			}
		
	}

	public static void main(String[] args) {
		ReverseMaxLen rev1 = new ReverseMaxLen();
		String[] str = rev1.setStr();
		rev1.getStr(str);
		String maxstr1 = rev1.maxLen(str);
		System.out.println("Lenght of Max String is "+maxstr1.length()+'\n'+"String with max lenght is : "+maxstr1);
		rev1.reverseStr(maxstr1);
	}
	
}
