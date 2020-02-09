package chaitanyaKDec19.assignment4_JavaLoopPrograms;

/* Pattern Printing
 * 1234
 * 567
 * 89
 * 10
 */

public class Question11 {

	public static void main(String[] args) {

		int count = 1;
		for (int i = 1; i <= 4; i++) {

			for (int j = i; j <= 4; j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();

		}

	}

}
