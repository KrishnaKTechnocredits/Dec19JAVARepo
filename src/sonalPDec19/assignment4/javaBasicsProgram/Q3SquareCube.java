package sonalPDec19.assignment4.javaBasicsProgram;

import java.util.Scanner;

/*
 * 3.	WAP to find the square and cube of a number.
 */

public class Q3SquareCube {

	void findSquareCubeOfNum(int num) {
		int square = num * num;
		int cube = num * num * num;
		System.out.println("Square of given no: " + square);
		System.out.println("Cube of given no: " + cube);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = s.nextInt();
		Q3SquareCube squarecube = new Q3SquareCube();
		squarecube.findSquareCubeOfNum(num);
	}
}
