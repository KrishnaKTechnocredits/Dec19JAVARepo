package vishwasCDec19.assignment1;
/*Write a program to print the sum of all the elements of an array of size 4. 
 */

public class Question2 
{
	public static void main(String[] args)
		{
			int arr[]={10,20,30,40};
			int totalSum=0;
			for(int i=0;i<arr.length-1;i++)
			{
				totalSum=totalSum+arr[i];
				
			}
			System.out.println("Sum is "+totalSum);
		}
	}


