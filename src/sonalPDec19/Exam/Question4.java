package sonalPDec19.Exam;
import java.util.ArrayList;

/*
Input: String = {“techno”, “credits”, “pune”}
Output: List = [techno, credits, pune]
 */
public class Question4 {

	public static void main(String[] args) {
		String[] array = { "techno", "credits", "pune" };
		ArrayList<String> list = new ArrayList<String>();

		for (String element : array) {
			list.add(element);
		}
		System.out.println(list);
	}
}
