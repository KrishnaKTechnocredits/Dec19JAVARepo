package ankitaPDec19.assignment1;
/*Write a program to print the sum of all the element of an array of size having N.*/

public class Question3 {
	
	  public static void main(String args[]){
			 
			 int [] num = {6, 3, 8,};
			 add(num);
			}
			
		  static void add(int [] num){
		     int sum = 0;
		    for (int i = 0; i<=num.length-1; i++ )
			{
			    sum = sum + num[i];
			}
			 System.out.println("The value of sum is:"+ sum);
		    }
		}  


