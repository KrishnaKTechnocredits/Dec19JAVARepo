package rutujaGDec19.Assignment1And2;
/*
 * To print sum of all elements of an arraya of size 4*/

public class Question2 {
	 static int[] num = new int[4];
		
		int sumOfArray(int[] x){
			int sum = 0;
		    for(int i = 0; i<x.length ;i++){
			sum = sum + x[i];
		    }
			return sum;
		}
	      public static void main(String[] args){
			num[0] = 10;
			num[1] = 20;
			num[2] = 30;     
			num[3] = 40;
			Question2 q = new Question2();
			System.out.println("Sum of array is : "+ q.sumOfArray(num));
		}

}
