package poojaRDec19.Assignment4;
//WAP to find the square and cube of anumber

public class Q3 {
	void square(int a) {
		int s = a * a;
		System.out.println("square is : " + s);
	}

	void cube(int a) {
		int c = a * a * a;
		System.out.println("Cube is : " + c);
	}

	public static void main(String[] args) {
		Q3 q3 = new Q3();
		int a = 5;
		q3.square(a);
		q3.cube(a);

	}

}
