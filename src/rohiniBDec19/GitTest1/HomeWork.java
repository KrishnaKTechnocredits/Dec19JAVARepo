package rohiniBDec19.GitTest1;

/*WAP to find string in given format Uppercase string odd Numbers sum Special chars Even Number Sum lower case string*/

public class HomeWork {
	public static void main(String[] args) {
		String str="ab*78AK143RSUraj";
		findString(str);
	}

	private static void findString(String str) {

		String upper="";
		int oddSum=0;
		int evenSum=0;
		String lower="";
		String sChar="";
		
		for(int i=0;i<str.length();i++) {
		
		
	    if(Character.isUpperCase(str.charAt(i)))
			upper=upper+str.charAt(i);
	    
		else if(Character.isDigit(str.charAt(i)))
		{
         // int num=Integer.parseInt((String.valueOf(str.charAt(i))));
		   	if(str.charAt(i)%2!=0)
			 oddSum=oddSum+Integer.parseInt((String.valueOf(str.charAt(i))));
			else
			 evenSum=evenSum+Integer.parseInt((String.valueOf(str.charAt(i))));
		}
		else if(Character.isLowerCase(str.charAt(i)))
			lower=lower+str.charAt(i);
		else
			sChar=sChar+str.charAt(i);
		}
		
      System.out.println("String is: "+upper+oddSum+sChar+evenSum+lower);
  }
}
