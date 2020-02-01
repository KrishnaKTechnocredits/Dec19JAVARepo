package rutujaGDec19.Assignment3;

import java.util.Scanner;

import javax.xml.transform.Source;

public class Question4 {
	public static void main(String[] args) 
    {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
    }
}