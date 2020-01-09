package prajvalShinde.Assignment2;

public class Question04 {
	void displayNum ( int[] num)
	{
		int smallest=num[0];
		int largest=num[0];
	   
	 for(int i=0;i<num.length;i++)
	 {
		 if(smallest>num[i])

		 {
			 smallest=num[i];
			 System.out.println(i);
		 }
		 else if(largest<num[i])
		 {
			 largest=num[i];
			 
		 }
		 
	 }
      System.out.println("smallest"+smallest);
      System.out.println("largest"+largest);
	}
	
	public static void main(String[] args) {
		Question04 input = new Question04();
		int[] arr ={2,6,3,9,11};
		input.displayNum(arr);
		
	}

}
