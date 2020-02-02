package poojaRDec19.pattern;

/*
 
    *
   **
  ***
 ****
*****

 */
public class Q3 {
	void p3() {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= i; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Q3 q3 = new Q3();
		q3.p3();

	}

}
