package rutujaGDec19.Assignment3;
/*Average of user defined array*/
import java.util.Scanner;
public class Question9 {
	void calAverage(double[] a , int size) {
		double sum  = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		double avg = sum/size;
		System.out.println("Average is : " + avg);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		double[] a = new double[size];
		System.out.println("Enter array :");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextDouble();
		}
		Question9 q = new Question9();
		q.calAverage(a ,  size);
	}

}
