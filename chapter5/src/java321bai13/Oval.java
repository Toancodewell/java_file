package java321bai13;

public class Oval implements Shape{
	private int a,b;

	public Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void draw() {
		System.out.println("ban kinh "+ a +": " + b);
	}

	@Override
	public double getArea() {
		return Math.floor(((a*b* Pi)*100000)/100000 );
	}
	
}
