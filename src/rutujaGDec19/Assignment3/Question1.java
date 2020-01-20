package rutujaGDec19.Assignment3;
/*
 * To write the positive and negative numbers from an array 
 * to print their sum
 * */
import java.util.Scanner;
public class Question1 {
	static void Check(int[] a) {
		int psum = 0;
		int nsum = 0;
		    for(int i = 0; i < a.length; i++)
		    {
		      if(a[i] >= 0)
		      {
		        System.out.println("Positive Number:"+a[i]);
		        psum += a[i];
		      }
		      else
		      {
		        System.out.println("Negative Number:"+a[i]);
		        nsum -= a[i];
		      }
		    }
		    System.out.println("Sum of positive numbers : " +psum);
		    System.out.println("Sum of negative numbers : " +nsum);
    }

	public static void main(String[] args) {
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        Check(a);
   }
}
