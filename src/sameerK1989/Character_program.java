package sameerK1989;

public class Character_program {
	static void Extract (String str)
	{
		String [] s3;
		s3=str.split(" ");
		System.out.println("Total words are " + s3.length);
		for (int i=0; i<s3.length; i++)
		{
			System.out.println("String" + i + " is " +s3[i] + " and its length is " + s3[i].length());
		}
	}
	
	public static void main(String[] args) {
		{
			String str = "Hi Hello Technocredits Good";
			Extract(str);
		}

	}
}

