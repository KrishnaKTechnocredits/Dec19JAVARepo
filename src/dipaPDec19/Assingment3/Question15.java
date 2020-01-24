package dipaPDec19.Assingment3;
/*
 * WAP to find string which has length more than 7characheter.
	a. Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”,
	”abhishek”}
	b. Output :- Krishna, aakansha, abhishek
 */
public class Question15 {
	public static void main(String[] args) {
		Question15 que15 = new Question15();
		String [] input = {"krishna","maulik","aakash","harsh","aakansha","abhishek"};
		
		que15.maxLength(input);
	}

	void maxLength(String[] str) {
		String maxString = null;
		for(int i = 0; i < str.length; i++)
		{
			if(str[i].length() >= 7)	//compares length of string.
				System.out.print(str[i]+", ");
		}
	}
}
