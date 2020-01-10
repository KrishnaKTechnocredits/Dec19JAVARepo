//program to add the corresponding elements of two arrays, each of size N and print sum

package sonali1297;

public class Assignment1_Q6 {

	public static void main(String[] args)
	{
	int [] N1= {3, 9, 8};

	int [] N2= {8, 12, 74};

	int [] sum = new int[N1.length];


	for ( int i = 0; i < N1.length; ++i) 

	{
		
		sum[i] = (N1[i] + N2[i]);

		
	}
	System.out.println("addition of two array indices:" +sum[0]+" " +sum[1]+" " +sum[2]);

		
	}
	}
