package rutujaGDec19.Assignment3;
/*Max length form given string*/
public class Question2 {
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
	public static void main(String[] args) {
		String[] a = {"all the best","technocredits","","maharashtra"};
		String s = maxLength(a);
		System.out.println("The maxlenght is : "+s.length() + " of string : "+s);
	}

}
