package java316;

public class Point3D extends Point {
	private int z;

	public Point3D(int x, int y,int z ) {
		super(x, y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "("+getX()+", "+getY()+", "+ getZ()+")";
	}
	public void moveUp() {
		setZ(4 );
	}
	public void move(int a  , int b ) {
		setX(a);
		setY(b);
	}
	public void moveDown() {
		setZ(3);
	}
	public void move(int a  , int b ,int z ) {
		setX(a);
		setY(b);
		setZ(z);
	}
}
