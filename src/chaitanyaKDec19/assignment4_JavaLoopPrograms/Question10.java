package chaitanyaKDec19.assignment4_JavaLoopPrograms;

/*
 * 1
 * 3 5
 * 7 9 11
 */

public class Question10 {

	public static void main(String[] args) {

		int count = 1;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count);
				count += 2;
			}
			System.out.println();
		}

	}

}
