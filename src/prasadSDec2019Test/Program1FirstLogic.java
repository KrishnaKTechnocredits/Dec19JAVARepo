package prasadSDec2019Test;

public class Program1FirstLogic {
	void UppercaseToEos(String s) {
		System.out.println(s);
		String s1=" ";
		String s2=" ";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch)) {
				
				s1=s1+ch;
			}
			else {
				s2=s2+ch;
			}
			
	}
		System.out.print(s2);
		System.out.print(s1);
}
	
	public static void main(String[] args) {
		/*int c='a';
		System.out.println(c);*/
		String s="Hellow There";
		Program1FirstLogic p3=new Program1FirstLogic();
		p3.UppercaseToEos(s);
		
	}
}
