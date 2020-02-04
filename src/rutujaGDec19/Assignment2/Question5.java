package rutujaGDec19.Assignment2;
/*
 * to display second largest number
 * */
public class Question5 {
	int findSecondMax(int[] arr) {
		int max,smax;
		
			max = smax = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] > max) {
					smax = max ;
					max  = arr[i];
				}
				else if(arr[i] > smax && arr[i] != max) {
					smax = arr[i];
				}
			}
		
		return smax;
	}
	public static void main(String[] args) {
		int[] arr = {1,3,5,4,9,7,6};
		Question5 q = new Question5();
		int smax =q.findSecondMax(arr);
		System.out.println("The second largest number is : "+ smax);
}
}
