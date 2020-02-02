
package ankitaPDec19.inheit_poly_abstarct_1;

public class Rectangle extends Shape {

	int l;
	int b;
	int area;

	void area() {
		area = l * b;
		System.out.println("The area of Rectangle is " + area);
	}

	Rectangle(int length, int width) {
		super("Red");
		this.l = length;
		this.b = width;
	}
}
