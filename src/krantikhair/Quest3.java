package krantikhair;

public class Quest3 {
	
		void number(int arr[],int num)
		{
			
			int index;
			boolean found=false;
			for(index=0;index<arr.length;index++)
			{
				if(arr[index]!=num)
					
					found=false;
				else
				{
					found =true;
					//break;
				}
			}
			if(found == true)
				System.out.println("number found at index" +index);
			else
				System.out.println("number is not in array");
		}

		public static void main(String[] args) {
			int[]arr={2,5,9,7,8,4,6,9};
			int num=8;
			Quest3 q = new Quest3();
			q.number(arr,num);
		}

	


}
