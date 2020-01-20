package rutujaGDec19.Assignment3;
/*To revere a string*/
import java.util.Scanner;
public class Question5 {
   static String original, reverse = "";
	     static void stringReverse() {
	    	 int length = original.length();

			    for (int i = length - 1 ; i >= 0 ; i--)
			      reverse = reverse + original.charAt(i);

			    System.out.println("Reverse of the string: " + reverse);
	     }
		 public static void main(String args[]){

		    Scanner in = new Scanner(System.in);

		    System.out.println("Enter a string to reverse");
		    original = in.nextLine();
            stringReverse();
		    
		  }
		}

