package praveenReddyDec19Assignment3;

/*
 WAP to find reverse max length string  
 a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”} 
 b. Output Max length string :- Technocredits 
 c. Max length string reverse value :- stiderconhcet
 */

public class ReverseofstringQ6 {
	
	static void MaxLength(String [] array) {
	
	int count = 0;
	String Maxlength = "";
	String Reverse = "";
	for(int i=0;i<array.length;i++)
	{
		if(array[i].length()>count)
		{
			count=array[i].length();
			Maxlength = array[i];
		}
	}
	System.out.println("Max size of the string is "+ count);
	System.out.println("Max length of string is "+ Maxlength );
	
	char ch[] = Maxlength.toCharArray();

	for (int i = ch.length - 1; i >= 0; i--) {
		Reverse = Reverse + ch[i];
		//System.out.print("Reverse string: "+ Reverse + " ");
	}
	System.out.print("Reverse string: "+ Reverse + " ");
	
	}
	public static void main(String[] args) {
		String [] array = {"all the best", "technocredits", "maharastra"};
		ReverseofstringQ6.MaxLength(array);
						
	}

}
 