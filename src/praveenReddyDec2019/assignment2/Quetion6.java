package praveenReddyDec2019.assignment2;

//)Write a java program to check the equality of two arrays? 

public class Quetion6 {
	public void Equality() {
		int a[] = { 21, 57, 11, 37, 24 };
		int b[] = { 21, 57, 11, 37, 24 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				count++;
			}
		}
		
		if (count == a.length) {
			System.out.println("array is same");
		} else {
			System.out.println("Not same");

		}

	}

	public static void main(String[] args) {
		Quetion6 equal = new Quetion6();
		equal.Equality();

	}
}
