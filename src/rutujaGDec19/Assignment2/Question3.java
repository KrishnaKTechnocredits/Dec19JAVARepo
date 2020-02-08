package rutujaGDec19.Assignment2;
/*
 * to check if your array contains given number*/
public class Question3 {
	boolean flag = false;
	void checkNumInArray(int[] arr , int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				flag = true;
				System.out.println("Number is present in array");
			}
		}
		if (flag == false) 
			System.out.println("Number is not present in array");
	}
	public static void main(String[] args) {
		int[] arr = {1,3,4,6,7,9,10};
		int num  = 2;
		Question3 q = new Question3();
		q.checkNumInArray(arr, num);
	}	
}
