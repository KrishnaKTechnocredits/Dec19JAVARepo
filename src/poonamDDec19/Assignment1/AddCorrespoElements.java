package poonamDDec19.Assignment1;
/*
 * corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100.
 */

public class AddCorrespoElements {
		void addition (int n){	
			int x[];
			int y[];
			x = new int[n];
			y = new int[n];
			int val = 3;
		for (int i=0;i<n;i++)
		{
			int sum=0;
			x[i]=val+i;
			y[i]=val+i;
			sum = sum+ (x[i]+y[i]);
			System.out.println("Sum of corresponding elements of two arrays: "+sum);
		}

	}
	public static void main(String []arg){
		AddCorrespoElements a= new AddCorrespoElements();
		a.addition(3);
		}
	}

