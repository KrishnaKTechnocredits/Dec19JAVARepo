package anjaliSDec19.Test11jan2020;

public class MidOfMaxString {

	void midOfMaxStr(String[] str)
	{
		String  maxname="";
		int cnt=0;
		
		for(int i=0; i<str.length;i++)
		{
			if(str[i].length()>cnt)
			{
				cnt=str[i].length();
				maxname = str[i];
			}
		}
		System.out.println("Max lenght name is :"+ maxname+ " and it lenght is :"+cnt);
		System.out.println("Mid character of max lenght name is :"+ maxname.charAt(cnt/2));
	}
	public static void main(String[] args) {
		MidOfMaxString m = new MidOfMaxString();             
		m.midOfMaxStr(args);
	}
}
