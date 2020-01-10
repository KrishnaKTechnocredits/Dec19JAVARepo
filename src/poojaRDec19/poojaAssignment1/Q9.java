package poojaRDec19.poojaAssignment1;
//9) You are given a String s. Count the number of occurrences of all the digits in the Integer number. 

class Q9
{
	void m1()
	{
		int cnt1=0,cnt2=0,cnt3=0,cnt4=0,cnt5=0,cnt6=0,cnt7=0,cnt8=0,cnt9=0,cnt0=0;
		String s="12324536";
		for(int i=0;i<s.length();i++)
		{
			char ch= s.charAt(i);
			if(ch=='1')
				cnt1++;
			else if(ch=='2')
				cnt2++;
			else if(ch=='3')
				cnt3++;
			else if(ch=='4')
				cnt4++;
			else if(ch=='5')
				cnt5++;
			else if(ch=='6')
				cnt6++;
			else if(ch=='7')
				cnt7++;
			else if(ch=='8')
				cnt8++;
			else if(ch=='9')
				cnt9++;
			else if(ch=='0')
				cnt0++;
		}
		System.out.println("1-> "+cnt1+"  "+"2-> "+ cnt2+"  "+"3-> "+cnt3+"  "+"4-> "+cnt4+"  "+"5-> "+cnt5+"  "+"6-> "+cnt6+"  "+"7-> "+cnt7+"  "+"8-> "+cnt8+"  "+"9-> "+cnt9);
	}
	public static void main(String args[])
	{
		Q9 d=new Q9();
		d.m1();
	}
}	