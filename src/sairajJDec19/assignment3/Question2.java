package sairajJDec19.assignment3;

public class Question2 {
	
	int getMaxLength(String[] a) {
		int maxString =0;
		maxString = a[0].length();
		for (int i = 1; i < a.length; i++) {
			if(a[i].length()>maxString) {
				maxString = a[i].length();
			}
		}
		return maxString;
	}
	
	public static void main(String[] args) {
		String[] a = {"all the best", "technocredits", "maharashtra","champion", "we are liverpool"};
		Question2 q1 = new Question2();
		System.out.println(q1.getMaxLength(a));
	}
}
