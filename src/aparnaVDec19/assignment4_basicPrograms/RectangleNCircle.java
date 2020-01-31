package aparnaVDec19.assignment4_basicPrograms;

/* 4.WAP to find the area and perimeter of Rectangle & Circle
 */
public class RectangleNCircle {
	public int rectangleArea(int length, int width) {
		int rectangleArea = length * width;
		System.out.println("Area of a Rectangle is :-> " + rectangleArea);
		return rectangleArea;
	}

	public int rectanglePerimeter(int length, int width) {
		int rectanglePerimeter = 2 * (length * width);
		System.out.println("Perimeter of a Rectangle is :-> " + rectanglePerimeter);
		return rectanglePerimeter;
	}

	public float circleArea(float radius) {
		float circleArea = (float) (3.14 * radius * radius);
		System.out.println("Ärea of a Circle is :-> " + circleArea);
		return circleArea;
	}

	public float circlePerimeter(float radius) {
		float circlePerimeter = (float) (2 * 3.14 * radius);
		System.out.println("Perimeter of a Circle is :-> " + circlePerimeter);
		return circlePerimeter;
	}

	public static void main(String[] args) {
		RectangleNCircle rc = new RectangleNCircle();
		rc.rectangleArea(4, 2);
		rc.rectanglePerimeter(6, 2);
		rc.circleArea(4);
		rc.circlePerimeter(2);

	}

}
