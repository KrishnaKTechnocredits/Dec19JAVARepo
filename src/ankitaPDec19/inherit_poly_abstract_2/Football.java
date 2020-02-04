package ankitaPDec19.inherit_poly_abstract_2;

public class Football extends Game {
	
	String playername;
	int noofgoals;
	
	Football(String s, int i)
	{
		super("Football");
		this.playername = s;
		this.noofgoals = i;
	}
	
	void display()
	{
		System.out.println("Class Football: " + "The Playe name is "+ this.playername + "The no of goals is "+ this.noofgoals);
	}

}
