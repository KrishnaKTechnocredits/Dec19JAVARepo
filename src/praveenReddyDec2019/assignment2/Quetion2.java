package praveenReddyDec2019.assignment2;

// Find duplicate number on Integer array in Java?

public class Quetion2 {
	public void DuplicateArray() {
		//int n = a.length;
		int a3[] = { 3, 5, 9, 5, 3, 7, 7 };
		for (int i = 0; i < a3.length; i++) {
			for (int j = i+1; j < a3.length; j++) {
				if (a3[i] == a3[j])
					System.out.println(a3[j]);
			}

		}
	//	System.out.println(a3[j]);
	}

	public static void main(String[] args) {
		Quetion2 a1 = new Quetion2();
		a1.DuplicateArray();
	}
}