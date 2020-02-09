package praveenReddyDec19Assignment3;

/*
 WAP to find max length String from the given array. 
 a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”} 
 */

public class MaxLenghtQ2 {
	static void MaxLength(String [] array) {
	
	int count = 0;
	String Maxlength = "";
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
	}
	public static void main(String[] args) {
		String [] array = {"all the best", "technocredits", "maharastra"};
		MaxLenghtQ2.MaxLength(array);
							
	}

}
 