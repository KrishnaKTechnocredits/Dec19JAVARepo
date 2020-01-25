package rutujaGDec19.Assignment3;
/*Sum of elements of two arrays*/
public class Question10 {
	static int calSum(int[] arr1,int[] arr2) {
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum = sum + arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			sum = sum + arr2[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr1 = {1,5,9,3,7};
		int[] arr2 = {1,7,9,3};
		int sum =  calSum(arr1, arr2);
		System.out.println("The sum is : "+ sum);
	}

}
