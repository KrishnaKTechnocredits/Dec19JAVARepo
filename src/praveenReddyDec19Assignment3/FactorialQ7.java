/**
 * 
 */
package praveenReddyDec19Assignment3;

/**
 WAP to find Factorial series for user defined number 
 a. Input number :- 5
 b. Output :- 120
 */
public class FactorialQ7 {
	static void FactorialOfNumber(int number)
	{
		int sum = 1;
		for (int i=1;i<=number;i++)
		{
			sum = sum * i; //1, 2, 6, 24, 120
			
		}
		System.out.println("factorial of "+number +" is: " + sum);
	}
	public static void main(String[] args) {
		int number = 5;
		FactorialQ7.FactorialOfNumber(number);
	}

}
