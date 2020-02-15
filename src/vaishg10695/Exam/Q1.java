/*1) WAP to Move all Uppercase char to the end of string
Input: Hellow There
	Output: ellow hereHT*/

package vaishg10695.Exam;

public class Q1 {

	
	public void move(String str)
	{
		String s1=str.replaceAll("[A-Z]+","");
		String s2=str.replaceAll("[a-z]+", ""); 
			
			System.out.println("String after operation: "+s1+s2);
	}
	public static void main(String[] args) {

		String str="Hellow There";
		System.out.println("Orignal String: "+str);
		
		Q1 q1=new Q1();
		q1.move(str);
		
		
	
	}

}
