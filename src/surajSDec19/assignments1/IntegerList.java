public class IntegerList{
	
	public void displayListOfInteger(int start, int end)
	{
		for(int i=start; i<=end; i++){
			
			System.out.println(i);
		
		}	
	
	}
	
	public static void main(String[] args){
		IntegerList integerList=new IntegerList();
		integerList.displayListOfInteger(5,10);
		
	}
}