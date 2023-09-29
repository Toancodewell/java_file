package java437;

public class Location {
	private int a,b;
	private String name;
	
	public Location() {
	}
	public Location(String name , int a, int b) {
		this.name=name;
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Location [a=" + a + ", b=" + b + ", name=" + name + "]";
	}
	
}
