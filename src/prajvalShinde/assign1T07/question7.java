package prajvalShinde.assign1T07;

public class question7 {
	void difference (int x, int y)
	{
		int result = x-y;
		if(result<0)
		{
			result = result *(-1);
		}
		System.out.println(result);
	}
	public static void main (String[] a)
	{
		question7 s1 = new question7();
		s1.difference(6, 12);
	}

}
