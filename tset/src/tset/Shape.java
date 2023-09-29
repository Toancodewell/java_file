package tset;



public interface Shape {
		final double Pi = 3.14;
		void draw();
		double getArea();
		default public  void redraw() {
			System.out.print("ve lai! ");
			draw();
		}
	}
	class Circle implements Shape  {
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
		}}
	class Oval implements Shape{
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
	 class Rect implements Shape{
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
	class test{
			public static void main(String[] args) {
//				Shape donut = new Circle(10);
//				donut.redraw();
//				System.out.print("ket qua :"+donut.getArea());
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
	 

