package vishwasCDec19.assignment3;
import java.util.Scanner;
public class Q12StringPalindrome 
{
	static void findPalindrome(String str)
	{
		String  rev = "";
		 int length = str.length();
		 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	      {
	         System.out.println(str+" is a palindrome");
	      }
	      else
	      {
	         System.out.println(str+ " is not a palindrome");
	      }
	}

	   public static void main(String args[])
	   {
		   
		    Scanner sc = new Scanner(System.in);

		    System.out.println("Enter a string:");
		    String str1 = sc.nextLine();
		    findPalindrome(str1);
		    System.out.println("Enter a string:");
		    String str2 = sc.nextLine();
		    findPalindrome(str2);
	   }
	}

	
