package abstract$extends;

public class Maybay extends Phuongtiendichuyen{
	protected String loainguyenlieu;

	public Maybay(String loaipt, hangsanxuat hangsx, String loainguyenlieu) {
		super(loaipt, hangsx);
		this.loainguyenlieu = loainguyenlieu;
	}
	public void catcanh( ) {
		System.out.println("cat canh ");
	}
	@Override
	public double vantoc() {
		return 500;
	}

	
}
