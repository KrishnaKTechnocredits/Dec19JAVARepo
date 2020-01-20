package rutujaGDec19.Assignment3;
/*Factorial of user defined number*/
import java.util.Scanner;
public class Question7 {
	static void calFactorial(int number) {
		int factorial=1;  
			 for(int i=1;i<=number;i++){    
			      factorial=factorial*i;    
			  }    
			  System.out.println("Factorial of "+number+" is: "+factorial);    
	 }    
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		calFactorial(number);
	}
}
