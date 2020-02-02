/*
 * 3.	WAP to find the square and cube of a number
 */
package anjaliSDec19.Assignment4.JavaBasicsProgram;

import java.util.Scanner;

public class SquareCube {

	int square(int n)
	{
		return n*n;
	}
	int cube(int n)
	{
		return n*n*n;
	}
	int setNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scan.nextInt();
		scan.close();
		return num; 
	}
	public static void main(String[] args) {
		SquareCube sq = new SquareCube();
		int num = sq.setNum();
		System.out.println("Square of the entered number is : "+sq.square(num));
		System.out.println("Cube of the entered number is : "+sq.cube(num));
	}
}
