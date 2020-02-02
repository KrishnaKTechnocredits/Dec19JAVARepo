package aparnaVDec19.assignment4_basicPrograms;

/* 1.	Write a Java program to print the sum (addition), 
 * multiply, subtract, divide and remainder of two numbers.
 */
public class SumMultiplySubtractDivideReminder {

	public void addition(int x, int y) {
		int z = x + y;
		System.out.println("Sum of Two Numbers:-> " + z);
	}

	public void subtract(int x, int y) {
		int z = x - y;
		System.out.println("Subtraction of Two Numbers:-> " + z);
	}

	public void multiply(int x, int y) {
		int z = x * y;
		System.out.println("Multiplication of Two Numbers:-> " + z);
	}

	public void divide(int x, int y) {
		int z = x / y;
		System.out.println("Division of Two Numbers:-> " + z);
	}

	public void remainder(int x, int y) {
		int z = x % y;
		System.out.println("Remainder of Two Numbers:-> " + z);
	}

	public static void main(String[] args) {
		SumMultiplySubtractDivideReminder smsdr = new SumMultiplySubtractDivideReminder();
		smsdr.addition(10, 5);
		smsdr.subtract(15, 5);
		smsdr.multiply(3, 2);
		smsdr.divide(20, 10);
		smsdr.remainder(12, 5);
	}
}
