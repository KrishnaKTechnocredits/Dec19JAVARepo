package vishwasCDec19.assignment4;
/*
 * 3.	WAP to find the square and cube of anumber
 */
import java.util.Scanner;
public class Q3SqureOfNo 
{
	public static void main(String args[])
	{
			Scanner sc=new Scanner(System.in);
			int num;

			System.out.print("Enter an integer number: ");
			num=sc.nextInt();

			System.out.println("Square of "+ num + " is: "+ Math.pow(num, 2));
			System.out.println("Cube of "+ num + " is: "+ Math.pow(num, 3));
		
		}
	}


