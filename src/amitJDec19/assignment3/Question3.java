package amitJDec19.assignment3;
/*
    *
   **
  ***
 ****
*****
 */
public class Question3 {
	static void pattern(int num) {
		for (int i=1;i<=num;i++) {
			for (int k=1;k<=num-i;k++) {
				System.out.print(" ");
			}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
			}
		System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		pattern(5);
	}
}