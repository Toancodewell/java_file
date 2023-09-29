package java321bai13;

public interface Shape {
	final double Pi = 3.14;
	void draw();
	double getArea();
	default public  void redraw() {
		System.out.print("ve lai! ");
		draw();
	}
}


 