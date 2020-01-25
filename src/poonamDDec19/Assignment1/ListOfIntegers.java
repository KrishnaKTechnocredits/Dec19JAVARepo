package poonamDDec19.Assignment1;
/*
 *  a program to list all the integers between two integers start and end(including start and end). 
 */

public class ListOfIntegers {
	void integersListInRange(int start, int end){
		for (int i=start;i<=end;i++)
			{
				System.out.print (i + " " );
			}
	}
   public static void main(String []args){
			ListOfIntegers list = new ListOfIntegers();
			list.integersListInRange(80,90);
		}
}


