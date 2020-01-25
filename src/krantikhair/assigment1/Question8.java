package krantikhair.assigment1;
class Array8
{
	String s = "krantiyuoosaaaee" ;
	void display()
		{
			int aCnt = 0;
			int eCnt = 0;
			int iCnt = 0;
			int oCnt = 0;
			int uCnt = 0;
				for(int i = 0;i < s.length();i++)
				{
					char ch = s.charAt(i);
					if (ch == 'a')
					{
						aCnt++;
					}
					else if (ch == 'e')
					{
						eCnt++;
					}
					else if (ch == 'i')
					{
						iCnt++;
					}
					else if (ch == 'o')
					{
						oCnt++;
					}
					else if (ch == 'u')
					{
						uCnt++;
					}
				}
				System.out.println (aCnt);
				System.out.println (eCnt);
				System.out.println (iCnt);
				System.out.println (oCnt);
				System.out.println (uCnt);
				
				
		}
	
	public static void main(String[] arg)
	{
	Array8 v = new Array8();
	v.display();
	
	
	}
}