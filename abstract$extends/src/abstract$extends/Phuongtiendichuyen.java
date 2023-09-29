package abstract$extends;

public abstract class Phuongtiendichuyen {
	protected String loaipt;
	protected hangsanxuat Hangsx;
	public Phuongtiendichuyen(String loaipt, hangsanxuat hangsx) {
		this.loaipt = loaipt;
		Hangsx = hangsx;
	}
	public String getLoaipt() {
		return loaipt;
	}
	public void setLoaipt(String loaipt) {
		this.loaipt = loaipt;
	}
	public hangsanxuat getHangsx() {
		return Hangsx;
	}
	public void setHangsx(hangsanxuat hangsx) {
		Hangsx = hangsx;
	}
	public String layten() {
		return this.Hangsx.getTenHang();
	}
	public abstract double vantoc();
}
