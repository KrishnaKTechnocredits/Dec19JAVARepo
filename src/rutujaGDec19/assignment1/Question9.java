package rutujaGDec19.assignment1;
/*
 * You are given a string s
 * Count the number occurrences of all the digits in the Integer number 
 * */

public class Question9 {
	static void numberOfOccurences(String s) {
	
 		for (int i = 0; i < s.length(); i++) {  // as if the number occurs only once i == index of char at i always
			if (i == s.indexOf(s.charAt(i))) { 
				int count =0;
    		    for(int j = 0; j<s.length(); j++) {
    			if(s.charAt(i) == s.charAt(j))
    				count++;
    		}
    		System.out.println("Frequency of digit "  +s.charAt(i)+" is: "+count);
		  }
		}
	
	}
		
	public static void main(String[] args) {
		String s = "124664213";
		numberOfOccurences(s);
	}		
}

	

