package java316;

public class ColorPoint extends Point {
	protected String cl;
	
	public ColorPoint(String cl) {
		super();
		this.cl = cl;
	}
	public ColorPoint(int x, int y) {
		super(x, y);
	}
	public ColorPoint() {
		
}

	public void setXY(int a  , int b  ) {
		setX(a);
		setY(b);
	
	}
	public String getCl() {
		return cl;
	}
	public void setCl(String cl) {
		this.cl = cl;
	}
	public String toString() {
		return "ColorPoint [cl=" + cl + ", y=" + getY() + ",x= "+getX()+
			  "]";
	}

	
	
	

}
