package aparnaVDec19.assignment4_basicPrograms;

/* 8.	WAP to swap two numbers using the third variable
 */
public class SwapNumbersUsingThirdVariable {
	public void swapNumbers(int x, int y) {
		System.out.println("Number Before swapping x value is:-> " + x);
		System.out.println("Number before swapping y value is:-> " + y);
		int z = x;
		x = y;
		y = z;
		System.out.println("Number after swapping now x value is:-> " + x);
		System.out.println("Number after swapping now y value is:-> " + y);
	}

	public static void main(String[] args) {
		SwapNumbersUsingThirdVariable swapNumbers = new SwapNumbersUsingThirdVariable();
		swapNumbers.swapNumbers(10, 20);
	}
}
