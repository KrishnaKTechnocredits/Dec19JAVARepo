package rutujaGDec19.Assignment3;
/*Max length form given string and reverse*/
public class Question6 {
	static String maxLength(String[] a) {
		String s =null ;
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			if(n < a[i].length()) {
			n = a[i].length();
			s = a[i];
			}
		}
		return s;
	}
	static String reverseString(String s) {
		int len = s.length();
		String reverse = "";
		   for (int i = len - 1 ; i >= 0 ; i--)
			      reverse = reverse + s.charAt(i);

		 return reverse;
	     }
		
	
	public static void main(String[] args) {
		String[] a = {"all the best","technocredits","","maharashtra"};
		String s = maxLength(a);
		System.out.println("The maxlenght is : "+s.length() + " of string : "+s);
		String reverse = reverseString(s);
		System.out.println("Reverse of the string: " + reverse);
	}

}


