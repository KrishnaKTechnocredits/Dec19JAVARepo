package sairajJDec19.assignment1;
class Count
{
	void getCount(String s)
	{	
		int[] arrC = new int[256];
		for (int i =0;i<s.length() ;i++ ) {
			arrC [s.charAt(i)]++;
			char ch[] = new char[s.length()];
			for ( i =0;i<s.length() ;i++ ) {
				ch[i] = s.charAt(i);
				int find = 0;
				for (int j=0;j<=i ;j++ ) {
					if (s.charAt(i)==ch[j]) {
						find++;
					}
					if (find==1) {
						System.out.println(s.charAt(i)+ " -> " + arrC[s.charAt(i)]);
					}
				}
			}
		}
	}


	public static void main(String[] args) {
		String ex = "128876";
		Count c1 = new Count();
		c1.getCount(ex);
	}
}