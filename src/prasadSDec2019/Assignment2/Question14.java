package Assignment2;

//) WAP to print even number from the array 

public class Question14 {

	void evenNumbers(int inputArray[]) {
		int count=0;
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i]%2==0) {
				System.out.println(inputArray[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int inputArray[]= {5, 6, 9, 10, 14, 63};
		Question14 q14=new Question14();
		q14.evenNumbers(inputArray);
	}
}
