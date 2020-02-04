package aparnaVDec19.assignment4_basicPrograms;

/* 3.	WAP to find the square and cube of a number
 */
public class CubeNSquareOfNumber {
	public void squareOfNumber(int x) {
		int z = x * x;
		System.out.println("Square of a given Number is:- > " + z);

	}

	public void cubeOfNumber(int y) {
		int z = y * y * y;
		System.out.println("Cube of a given Number is:- > " + z);
	}

	public static void main(String[] args) {
		CubeNSquareOfNumber cubeSquare = new CubeNSquareOfNumber();
		cubeSquare.squareOfNumber(5);
		cubeSquare.cubeOfNumber(2);
	}
}
