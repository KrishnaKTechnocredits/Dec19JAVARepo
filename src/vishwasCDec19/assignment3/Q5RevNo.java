package vishwasCDec19.assignment3;
/*
 * WAP to reveres user given number
 */
import java.util.Scanner;
public class Q5RevNo 
{
	static void reverse(String number) {

		for (int i = number.length() - 1; i >= 0; i--) 
		{
			char r = number.charAt(i);
			System.out.print(r);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter number");
		Scanner s = new Scanner(System.in);
		String number = s.next();
		reverse(number);
		
	}
}
