package sairajJDec19.assignment3;

public class Question1 {
	
	void printPosAndNegNumber(int[]a) {
		int ncount =0;
		int pcount =0;
		for(int i=0; i<a.length;i++) {
			if(a[i]<0) {
				ncount++;
			}else {
				pcount++;
			}
		}
		int[] pos = new int[pcount];
		int[] neg = new int[ncount];
		int n =0;
		int p =0;
		for(int i=0; i<a.length;i++) {
			if(a[i]<0) {
				neg[n]= a[i];
				n++;
			}else {
				pos[p]=a[i];
				p++;
			}
		}
		int sumPos =0;
		int sumNeg =0;
		System.out.println("Positive numbers are: ");
		for(p=0;p<pos.length;p++) {
			System.out.print(pos[p]);
			sumPos = sumPos + pos[p];
		}
		System.out.println("");
		System.out.println("Negative numbers are: ");
		for(n=0; n<neg.length;n++) {
			System.out.print(neg[n]);
			sumNeg = sumNeg + neg[n];
		}
		System.out.println("");
		System.out.println("Sum of Positive numbers is : "+ sumPos);
		System.out.println("Sum of Negative numbers is : "+ sumNeg);
	}
	
	public static void main(String[] args) {
		int[] arr = {5,6,-9,14,-25,6,7,-14};
		Question1 q1 = new Question1();
		q1.printPosAndNegNumber(arr);
	}
}