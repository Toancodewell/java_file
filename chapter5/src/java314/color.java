package java314;

public class color extends java314 {
	private int ma;

	public color(int size, int ma) {
		super(size);
		this.ma = ma;
	}
	
	public int getMa() {
		return ma;
	}

	public void print() {
		System.out.println(getSize()+"," +getMa( ));
	}
	
	

}
