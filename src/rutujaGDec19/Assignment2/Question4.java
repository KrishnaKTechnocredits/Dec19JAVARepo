package rutujaGDec19.Assignment2;
/*
 * Largest number in an unsorted array
 * */
public class Question4 {
	int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
			max = arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr = {1,3,5,4,9,7,6};
		Question4 q = new Question4();
		int max =q.findMax(arr);
		System.out.println("The largest number is : "+ max);
	}
}
