package vishwasCDec19.assignment3;
/*
 *  WAP to find sum of user given number
 */
import java.util.Scanner;
public class Q4SumOfNo 
{
	static int total;

	static void totalAdd(String number)
	{

		for (int i = 0; i < number.length(); i++)
		{
			Character u;
			u = number.charAt(i);
			String c = u.toString();
			int x = Integer.parseInt(c);
			total = total + x;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter number");
		Scanner s = new Scanner(System.in);
		String number = s.next();
		totalAdd(number);
		System.out.println("sum is :"+total);
	}
}
