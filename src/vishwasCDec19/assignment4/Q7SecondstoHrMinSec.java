package vishwasCDec19.assignment4;
/*
 * 7.	Write a Java program to convert seconds to hour, minute andseconds
 */
import java.util.Scanner;
public class Q7SecondstoHrMinSec 
{
	public static void main(String[] args)
	{
		// create object of scanner class.
		Scanner in = new Scanner(System.in);

		// enter the seconds here.
		System.out.print("Enter seconds : ");

		int seconds = in.nextInt(); 

		int p1 = seconds % 60;
		int p2 = seconds / 60;
		int p3 = p2 % 60;

		p2 = p2 / 60;

		System.out.print("HH:MM:SS =" +p2 + ":" + p3 + ":" + p1);
		System.out.print("\n");
	}  
}

