package ankitaPDec19.inheit_poly_abstarct_1;

public class Triangle extends Shape {
	int base;
	int height;
	int area = 0;

	void area() {
		area = base * height;
		System.out.println("The area of Triangle is " + area);
	}

	Triangle(int b, int h) {
		super("Green");
		base = b;
		height = h;
	}

}
