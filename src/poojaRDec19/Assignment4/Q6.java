package poojaRDec19.Assignment4;
/*
 * Write a Java program to convert temperature
 *  from Fahrenheit to Celsiusdegree.

 */
public class Q6 {
	
	void conversion(int temp)
	{
		int tempInCelsius =(int) ((temp-32)*0.5556);
		System.out.println("temp in celsius is : "+tempInCelsius);
	}

	public static void main(String[] args) {
		int tempInFahrenheit =50;
		Q6 q6=new Q6();
		q6.conversion(tempInFahrenheit);
	}

}
