package java321bai13;

public class Circle implements Shape  {
	private double Cr;
	
	public Circle(double cr) {
		this.Cr = cr;
	}

	public void draw() {
		System.out.println("ban kinh "+ this.Cr );
		
	}

	@Override
	public double getArea() {
		return Cr*Cr*Pi;
	}

	
	
	
	
	public static void main(String[] args) {
//		Shape donut = new Circle(10);
//		donut.redraw();
//		System.out.print("ket qua :"+donut.getArea());
		Shape[] list = new Shape[3 ];
		list[0 ]= new Circle(10 );
		list[1]= new Oval(20,30 );
		list[2 ]= new Rect(10,40 );
		for(int i=0;i<list.length;i++ ) {
			list[i].redraw();
		}
		for(int i=0;i<list.length;i++ ) {
			System.out.println("ket qua :"+list[i].getArea());
		}
	}

}
