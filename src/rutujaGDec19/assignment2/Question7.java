package rutujaGDec19.assignment2;
/*to display numbers in array whose sum is equal to given number*/
public class Question7 {
	void printPairEqualToSum(int[] array , int num) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i] + array[j] == num) {
					System.out.println("("+array[i]+","+array[j]+") has its sum equal to : "+num);
				}
			}		
		}
	}
	public static void main(String[] args) {
		int[] array = {2,3,4,5,7,8,9};
		int num = 7;
		Question7 q = new Question7();
		q.printPairEqualToSum(array, num);
			
	}
}
