package sairajJDec19.assignment3;


public class Question6 {
	
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
	
	String reverseMaxString(String[] a) {
		String reverse = "";
		for(int i=0; i>=a.length; i++) {
			if(a[i].length()==getMaxLength(a)) {
				for(int j=a[i].length(); j>=0; j--) {
					reverse += a[i].charAt(j);
				}
			}
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		String[] a = {"all the best", "technocredits", "maharashtra", "we are liverpool"};
		Question6 q1 = new Question6();
		System.out.println(q1.reverseMaxString(a));
		//ou
	}
}
