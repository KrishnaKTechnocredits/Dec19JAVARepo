package vishwasCDec19.assignment4;
/*
 * 6.	Write a Java program to convert temperature from Fahrenheit to Celsiusdegree.
 */
import java.util.Scanner;
public class Q6FahrenheitToCelsius 
{
	 public static void main(String[] args) {
		    float temperature;
		    Scanner in = new Scanner(System.in);

		    System.out.println("Enter temperature in Fahrenheit");
		    temperature = in.nextInt();

		    temperature = ((temperature - 32)*5)/9;

		    System.out.println("temperature in Celsius = " + temperature);
		  }
		}

