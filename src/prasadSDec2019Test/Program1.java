package prasadSDec2019Test;

public class Program1 {
	
	String LowerCase(String s) {
		s=s.replaceAll("[A-Z]", "");
		System.out.println(s);
		return s;
	}
	
	String UpperCase(String s) {
		s=s.replaceAll("[a-z]","");
		System.out.println(s);
		return s;
	}
	
	public static void main(String[] args) {
		String s="Hello There";
		Program1 p1=new Program1();
		String s1=p1.LowerCase(s);
		String s2=p1.UpperCase(s);
		System.out.println(s1+s2);
	}

}
