package java321bai13;

public class Rect implements Shape{
	private int a,b;

	public Rect(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void draw() {
		System.out.println("ban kinh "+ a +": " + b);
	}

	@Override
	public double getArea() {
		return a*b ;
	}

}
