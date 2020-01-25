package vishwasCDec19.assignment3;

/*
 * WAP to find number is palindrome or not ?
 */
import java.util.Scanner;
public class Q11NoPalindromeOrNot 
{
	static void palindrom(String str)
	{
		String str2 = "";
		for (int i = str.length() - 1; i >= 0; i--) 
		{
			char ch = str.charAt(i);
			str2 = str2 + ch;
	   }
	   System.out.println(str2);
	   if (str.equals(str2))
	   {
		   System.out.println("Number is palindrome");
	   } 
	   else
	   {
		System.out.println("Number is not palindrome");
	   }
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		String str = Integer.toString(number);
		palindrom(str);
    }

}
