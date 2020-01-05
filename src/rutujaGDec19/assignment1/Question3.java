package rutujaGDec19.assignment1;
/*
 * 3. To print sum of all elements of an array of size n
 * 4. To print sum of squares of all elements of an array of size n
 * Q3 qnd Q4 Together */
public class Question3 {
	int sumOfArray(int[] x){
		int sum = 0;
	    for(int i = 0; i<x.length ;i++){
		sum = sum + x[i];
	    }
		return sum;
    }
	int sumOfSquare(int[] x){
	int sum = 0;
	    for(int i = 0; i<x.length ;i++){
		sum = sum + (x[i]*x[i]) ;
	    }
		return sum;	
	}
    public static void main(String[] args){
		int[] arr = new int[]{1,2,3};
		Question3 three = new Question3();
		System.out.println("Sum of array is : "+ three.sumOfArray(arr));
		System.out.println("Sum of array is : "+ three.sumOfSquare(arr));
	}

}
