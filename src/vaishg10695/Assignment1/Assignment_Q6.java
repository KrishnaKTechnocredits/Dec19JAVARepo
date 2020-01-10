/*6) Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100. 1≤N≤100
 Hint: 
 Input:   int input1[] = {3, 9, 8,} int input1[] = {8, 12, 74}
 Output:   11 21 82  */
 
 package vaishg10695.Assignment1;
 
 class Assignment_Q6
 {
	 
	 void add(int[] a1, int[] a2)
	 {
		 int add = 0;
			if (a1.length == a2.length)
				{
					for (int i =0; i<a1.length; i++)
						{
							add = a1[i] + a2[i];
							System.out.println("Sum of corresponding elements of two arrays is " + add);
						}
				}
			else 
				System.out.println("array length is mismatch");
	 }
	 
	 
	 
	 public static void main(String[] args)
	 {
		 int ary1[]={3,9,8};
		 int ary2[]={8,12,74};
		 Assignment_Q6 q6=new Assignment_Q6();
		 
		 q6.add(ary1,ary2);
	 }
 }