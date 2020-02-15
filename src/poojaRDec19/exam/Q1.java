package poojaRDec19.exam;

public class Q1 {

	public static void main(String[] args) {
		String k ="";
		String s="Hello There";
		for(int i=0;i<s.length();i++) {
			
			if(Character.isLowerCase(s.charAt(i)))
			{
				System.out.print(s.charAt(i));
			}
			else if(Character.isSpace(s.charAt(i)))
			{
				
			}
			else {
			
			k=k+s.charAt(i);
			}
		}
		System.out.print(k);
		

	}

}
