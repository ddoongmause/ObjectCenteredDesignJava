package chapter14;

public class Player {

	private String name;
	private String nation;
	
	public Player(String name ) {
		this(name, "");
	}
	
	public Player(String name, String nation) {
		this.name = name;
		this.nation = nation;
	}
	
	public String toString() {
		return name + ":" + nation;
	}
}
