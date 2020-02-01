package yashashrikDec19.Assignment3;
/*2) WAP to find max length String from the given array.
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}*/
import java.util.Scanner;

public class MaxLengthQ2 {

 void maxLength(String[] array)
	{
		int temp= 0;
		int index=0;
		int i=0;
		//String string="";
	
		for( i=0;i<array.length;i++)
		{
			
			if(temp<array[i].length())
			{
				temp=array[i].length();
				index=i;
			}
			
				
		}
		System.out.println(array[index]);
		
	//	System.out.println(i);
	}
	 
	
	public static void main(String[] args) {
		MaxLengthQ2 q2=new MaxLengthQ2();
		String[] array= {"All the best","Technocredits","Maharashtra"};
		
		q2.maxLength(array);
	}
}
