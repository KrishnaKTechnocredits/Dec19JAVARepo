package poojaRDec19.Assignment3;

/*9) WAP to find average of user given array
a. Input :- {14, 32, 19, 14, 78,36}
b. Output:- 32.16*/
import java.util.*;

public class Q9 {

	void avg() {
		double avarage = 0;
		double sum = 0;
		System.out.println("Enter size of Array");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int array1[] = new int[a];
		System.out.println("Enter Array");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = s.nextInt();

		}

		for (int i = 0; i < array1.length; i++) {
			sum = array1[i] + sum;
		}
		avarage = sum / array1.length;
		System.out.println(avarage);

	}

	public static void main(String[] args) {

		Q9 q9 = new Q9();
		q9.avg();
	}

}
