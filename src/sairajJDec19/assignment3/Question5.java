package sairajJDec19.assignment3;

public class Question5 {
	
	static void reverseInt(int a) {
		int b = 0;
		while(a!=0) {
		int	c = a%10;
			b = (b*10)+c;
			a = a/10;
		}
		System.out.println("Reversed number is : "+ b);
	}
	public static void main(String[] args) {
		int a = 4501;
		reverseInt(a);
	}
}
