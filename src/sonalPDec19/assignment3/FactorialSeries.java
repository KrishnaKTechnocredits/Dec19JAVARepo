package sonalPDec19.assignment3;
/*
 * WAP to find Factorial series for user defined number
 * a. Input number :- 5
   b. Output :- 120
 */
import java.util.Scanner;

public class FactorialSeries {
	
	void findFactorialSeries(int inputNum)
	{
		int factorialNo = 1;
		for(int i=1; i<=inputNum; i++)
		{
			factorialNo = factorialNo * i;
		}
			System.out.println("Factorial series of given number: "+ factorialNo);
	}
	
	public static void main(String[] args) {
		FactorialSeries factorialseries = new FactorialSeries();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter No.: ");
		int no = s.nextInt();
		factorialseries.findFactorialSeries(no);
	}

}
