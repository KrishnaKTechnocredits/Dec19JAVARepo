package laxmanRDec19.assignment1;

public class Uppercase {
	
	
	void changeToUpperCase(String string) {
		
		System.out.println("Original input is:"+string+" and converted output is: "+string.toUpperCase());
			
				
	}
static void changeToLowerCase(String string) {
		
	System.out.println("Original input is:"+string+" and converted output is: "+string.toLowerCase());

}
public  static void main(String[]args) 
{
	new Uppercase().changeToUpperCase("qwerty");
	
	changeToLowerCase("QWERTY");
	
}
	
	
}
