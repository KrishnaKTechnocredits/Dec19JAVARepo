/*4) WAP to Convert String into comma separated List in Java
Input: String = {“techno”, “credits”, “pune”}
Output: List = [techno, credits, pune]*/


package vaishg10695.Exam;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {

		String s= "techno credits pune";
		System.out.println("Given String: "+s);
	
        String[] element = s.split(" "); 
        
       // List<String>l=new ArrayList<String>(element);
        //List list = (List) Arrays.asList(element); 

        List<String> list = Arrays.asList(element); 

        	System.out.println("String after converting to List: "+list);
	}

}
