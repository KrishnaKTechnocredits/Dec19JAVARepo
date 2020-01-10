package ankitaPDec19.assignment1;

/*You are given a String s. Count the number of occurrences of all the digits in the 
 * Integer number.*/

public class Question9 {
	
    static void display(char ch,String s)
    {
    	int count = 0;
    	for (int i = 0; i < s.length(); i++)
    	{
    		if(ch == s.charAt(i))
    			count++ ;
    	}
    	System.out.println("For the character" + ch + "the frequency is" + count);
    	
	}
public static void main(String [] args) {
	
	    String s = "128896";
	    for (int i = 0; i<s.length();i++)
	    {
            char ch = s.charAt(i);
            if (i == s.indexOf(ch))
            	display(ch,s);

	    }
	
}

}
