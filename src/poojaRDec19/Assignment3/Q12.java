package poojaRDec19.Assignment3;
/*
 * 12) WAP to find word is palindrome or not ?
a. String name = “naman”
i. Naman is palindrome
b. String name = “harsh”
i. Harsh is not palindrome
 */
public class Q12 {
	String g="";
	void wordPalindrom(String s)
	{String o=s;
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			g=g+c;
			
		}
		System.out.println(g);
		if(s.equals(g))
		{
		System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
	}

	public static void main(String[] args) {
		 Q12 q112=new Q12();
		 String s="naman";
		 q112.wordPalindrom(s);
	}

}
