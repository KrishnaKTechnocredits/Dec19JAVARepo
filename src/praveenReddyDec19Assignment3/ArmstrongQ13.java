package praveenReddyDec19Assignment3;

/*
 WAP to find number is Armstrong or not. 
 a. Int number = 153 i. Number is Armstrong 
 b. Int number = 234 i. Number is not Armstrong  
 Note :- Armstrong number means sum of each number cubes to number it self. 
 */

public class ArmstrongQ13 {
	static void ArmStrongOfNumber(int Number1, int Number2) {
		int Number1Sum = 0;
		int Number2Sum = 0;
		int temp = Number1;
		int temp1= Number2;
		int digit = 0;
		int digit1 = 0;
		
		while (temp > 0) {
			digit = temp % 10; // 3
			Number1Sum = (digit * digit * digit) + Number1Sum; // 3*3*3 +3
			temp = temp / 10;
		}
		if (Number1Sum == Number1)
			System.out.println(Number1 + " is ArmStrongOfNumber ");
		else
			System.out.println(Number1 + " is not ArmStrongOfNumber ");
		
		while (temp1 > 0) {
			digit1 = temp1 % 10; // 3
			Number2Sum = (digit1 * digit1 * digit1) + Number2Sum; // 3*3*3 +3
			temp1 = temp1 / 10;
		}
		if (Number2Sum == Number2)
			System.out.println(Number2 + " is ArmStrongOfNumber ");
		else
			System.out.println(Number2 + " is not ArmStrongOfNumber ");
	}

	public static void main(String[] args) {
		int Number1 = 153;
		int Number2 = 234;
		ArmstrongQ13.ArmStrongOfNumber(Number1, Number2);
	}
}
