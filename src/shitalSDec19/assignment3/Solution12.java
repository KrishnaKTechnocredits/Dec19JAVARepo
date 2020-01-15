/* WAP to find word is palindrome or not ? 
 * a. String name = “naman” i. Naman is palindrome 
 * b. String name = “harsh” i. Harsh is not palindrome  */

package shitalSDec19.assignment3;
import java.util.Scanner;
public class Solution12 {
	String reverse="";
	boolean flag = false;
	void doReverse(String s)
	{
		for (int i=s.length()-1; i>=0;i--)
		{
			reverse = reverse + s.charAt(i);
			if (s.equals(reverse))
				flag = true;
			else
				flag = false;
		}
			if (flag == true)
				System.out.println("String name " + s + " is palindrome");
			else
				System.out.println("String name " + s + " is NOT palindrome");
	}
	public static void main(String[] args) {
		Solution12 solution12 = new Solution12();
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		solution12.doReverse(s);
	}
}
