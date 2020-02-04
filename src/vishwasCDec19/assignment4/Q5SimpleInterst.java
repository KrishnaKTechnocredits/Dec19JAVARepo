package vishwasCDec19.assignment4;
/*
 * 5.	Write a Java program to compute simple interest
 */
import java.util.Scanner;
public class Q5SimpleInterst
{
		public static void main(String args[]) 
	    {
	        float p, r, t;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the Principal : ");
	        p = s.nextFloat();
	        System.out.print("Enter the Rate of interest : ");
	        r = s.nextFloat();
	        System.out.print("Enter the Time period : ");
	        t = s.nextFloat();
	        float si;
	        si = (r * t * p) / 100;
	        System.out.print("The Simple Interest is : " + si);
	    }
}

