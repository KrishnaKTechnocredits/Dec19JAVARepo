package kedarKDec19.Assignment3;

public class Question6 {
	
	
	/*
	 * reverse string 
	 * 
	 * 
	 */

	static void getLongest(String[] s) {
		int n = 0;
		String m = null;
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > n) {
				n = s[i].length();
				m = s[i];

			}

		}
		System.out.println(m);
	
		int j = n - 1;
		while(j>=0) {
			
			System.out.print(m.charAt(j));
			j--;
			
		}
		

	}

	public static void main(String[] args) {
		String[] s = { "all the best", "technocredits", "", "maharastra" };
	     getLongest(s);
		
	}

}
