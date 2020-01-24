package kedarKDec19.Assignment2;

public class Question2 {

	/*
	 * To check the Duplicate number 
	 * 
	 * 
	 */
	static void Duplicate(int[]arr) {
		
			
				//int DupNum=0;
				for(int i=0;i<arr.length;i++)
				{
					for(int j=i+1;j<arr.length;j++)
					{
						
						if(arr[i]==arr[j])
						{
							
							System.out.println("Duplicate number is " +arr[i]);
						
						}
					}
					//System.out.println(i);
				}
			
			
	}
	
	
	public static void main(String[] args) {
		{
			
			int[] num={0,3,2,2,3};
			Duplicate(num);
		}
	}
}
