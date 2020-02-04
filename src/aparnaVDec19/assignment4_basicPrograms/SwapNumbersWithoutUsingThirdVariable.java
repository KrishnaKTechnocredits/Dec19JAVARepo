package aparnaVDec19.assignment4_basicPrograms;

/* 9.	WAP to swap two numbers without using the third variable.
 */
public class SwapNumbersWithoutUsingThirdVariable {
	public void swapNumbersWithoutVariable(int x, int y) {
		System.out.println("Number Before swapping x value is:-> " + x);
		System.out.println("Number before swapping y value is:-> " + y);
		x = (x + y);// value of 'x' is now 30, so x=30
		y = (x - y);// value of 'y' is now 30-20=10, so y=10
		x = (x - y);// value of again 'x' is now changed to 30-10=20
		System.out.println("After number swaping");
		System.out.println("x is now after swapping :-> " + x);
		System.out.println("y is now after swapping :-> " + y);
	}

	public static void main(String[] args) {
		SwapNumbersWithoutUsingThirdVariable swapNumbers = new SwapNumbersWithoutUsingThirdVariable();
		swapNumbers.swapNumbersWithoutVariable(10, 20);
	}
}
