package chaitanyaKDec19.assignment4_JavaLoopPrograms;

/*
 * Write programs to generate following outputs-
 * A
 * AB
 * ABC
 */

public class Question08 {

	public static void main(String[] args) {

		for (int i = 65; i <= 67; i++) {
			for (int j = 65; j <= i; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}

	}

}
