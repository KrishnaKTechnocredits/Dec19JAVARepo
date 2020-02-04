package ankitaPDec19.inherit_poly_abstract_2;

public class Cricket extends Game {
	String playername;

	Cricket(String s)
	{
		super("Cricket");
		this.playername = s;
	}
	
	void display()
	{
		System.out.println("Class Cricket: " + "The Playe name is "+ this.playername);
	}

}
