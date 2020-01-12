package swatiShinde30.assignment1;
/*
Write a program to list all the integers between two integers start and end(including start and end). 
*/
class Sequence
	{
		void displayList(int start, int end)
			{
				System.out.println("Sequence of values between "+start+" and "+end+" is ");
				for(int i = start; i< end; i++)
					{
						System.out.println(i);
					}
			}
		public static void main(String[] args)
			{
				Sequence sequence = new Sequence();
				sequence.displayList(4,8);
			}
	}