package surajSDec19.Assignment2;

public class Question_4 {

	public void smallAndLargeNum(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}System.out.println("larger:"+max);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<max)
			{
				max=arr[i];
			}
		}System.out.println("Smaller:"+max);
		
		
	}
	public static void main(String[] args) {
		int[] arr={2, 6, 3, 9, 11};
		Question_4 question_4=new Question_4();
		question_4.smallAndLargeNum(arr);

	}

}
