/*
 * WAP to print list of all integers between 2 integers start and end(including start and end)
 */
package anjaliSDec19.Assignment1;

public class ListOfElements {
	void printList(int start, int end)
	{
		System.out.print("Elements between " + start + " and " +end + " are :" );
		for (int i=start;i<=end;i++)
		{
			System.out.print(i+ " ");
		}
		
	}
	public static void main(String[] args) {
		ListOfElements l1 = new ListOfElements();
		int start = 5;
		int end = 10;
		
		l1.printList(start,end);
	}

}
