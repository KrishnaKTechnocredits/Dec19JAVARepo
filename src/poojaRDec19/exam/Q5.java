package poojaRDec19.exam;

public class Q5 {

	public static void main(String[] args) {
		String s="Hello, How are You?";
		System.out.println("Original String :: "+s);
		System.out.print("new String :: ");
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLetter(s.charAt(i))||Character.isSpace(s.charAt(i)))
			{
				System.out.print(s.charAt(i));
			}
		}

	}

}
