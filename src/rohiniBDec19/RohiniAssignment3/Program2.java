package rohiniBDec19.RohiniAssignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String input");
	    String str =sc.nextLine();
	    findMaxString(str);

		
	}

	private static void findMaxString(String str) {
		int maxLength=0;
		String maxString="";
		String[] strArr=str.split(" ");
		for(int i=0;i<strArr.length;i++)
		{
			if(maxLength<strArr[i].length())
			{
				maxLength=strArr[i].length();
				maxString=strArr[i];
			    
		    }
		
	    }
		System.out.println("Max Length of string is: "+maxLength+" & String is: "+maxString);
  }
}