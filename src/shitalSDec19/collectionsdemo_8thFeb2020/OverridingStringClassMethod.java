// OverridingStringClassMethod

package shitalSDec19.collectionsdemo_8thFeb2020;

public class OverridingStringClassMethod {
	int rNo;
	String name;

	OverridingStringClassMethod(int rNo, String name) {
		this.rNo = rNo;
		this.name = name;
	}

	public static void main(String[] args) {
		OverridingStringClassMethod s1 = new OverridingStringClassMethod(1, "Techno");
		System.out.println(s1);
		System.out.println(s1.toString());//ye method parent class ki cheezo ko print nahi karega q k humne apne class me usko override kiya hai. agar hum apne class ki override method hata denge to toString method parent class ki behaviour ko override karke le aayega

	}

	@Override
	public String toString() {
		return "Employee rNo is " + rNo + " and name is " + name;
	}
}
