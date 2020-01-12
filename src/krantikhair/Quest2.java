package krantikhair;

public class Quest2 {
	
	static void number(int a[])
	{
		for (int i = 0; i <a.length;i++)
			for (int j = i+1; j <a.length;j++)

				{
					if ((a[i]) == a[j])

					{
						System.out.println("duplicate found " + a[i]);
					}

				}
		
		
		
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,3,6,5,6};
		Quest2 d = new Quest2();
		d.number(a);
	}

}
