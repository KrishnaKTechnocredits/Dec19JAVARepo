package ankitaPDec19.assignment1;

/*You are given a String s, which comprises English alphabets, determine the count of all the vowels in S. Vowels are [a,e,i,o,u]. 
 * Print the count of all the vowels that are available in the String s.*/
 

public class Question8 {
	
	static int count = 0;
	static void display(String s)
	{
		String a = "aeiou";
		for (int i = 0; i<s.length();i++)
		{
			for (int j =0; j<a.length();j++)
			{
				if(a.charAt(j) == s.charAt(i))
					count++ ;
			}
		} System.out.println(count);
	}
	
	public static void main(String [] args) {
		 String str = "ankita";
		 display(str);
	}

}
