package krantikhair;

public class Split1 {
	
	static void Display(String s)
	{
	String a[] 	=s.split(" ");
	System.out.println("The total words are" +  a.length  );
	}
	
	public static void main(String[] args) 
	{
		String s = "Hi Hello Technocredits Good";
		Display(s);
		
	}

}
