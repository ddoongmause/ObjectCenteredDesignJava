package chapter14;

public class SampleObj {
	private String name;
	public SampleObj(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	public boolean equals(Object obj) {
		String currentObj = this.toString();
		String otherObj = obj.toString();
		System.out.println("ÀÌ°Ô ³ª¿È?");
		return currentObj.equals(otherObj);
	}
}
