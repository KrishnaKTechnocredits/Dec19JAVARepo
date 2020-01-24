package kedarKDec19.Assignment1;

public class Sumoftwoarray {
/*
 * 
 * /*Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100. 1=N=100
Hint:
Input: int input1[] = {3, 9, 8,}
int input1[] = {8, 12, 74}
Output: 11 21 82*/
 * 
 * 
 */
 
 static int calculate(int[] a, int[] b) {
	 
	 int sum=0;
	 for (int i=0;i<a.length;i++) {
		 sum=sum+a[i]+b[i];
		 
	 }
	 return 0;
 }
 
 public static void main(String[] args) {
	 {
		 int input1[] = {3, 9, 8,};
		 int input2[] = {8, 12, 74};
		 
		 calculate(input1,input2);
	 }
}
 
}
