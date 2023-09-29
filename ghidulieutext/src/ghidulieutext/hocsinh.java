package ghidulieutext;

public class hocsinh {
	private int tuoi;
	private String name;
	public hocsinh(int tuoi, String name) {
		this.tuoi = tuoi;
		this.name = name;
	}
	@Override
	public String toString() {
		return "hocsinh [tuoi=" + tuoi + ", name=" + name + "]";
	}
//	public static void main(String[] args) {
//		double money = 24;
//		double t = 0.06;
//		long year = 382;
//		for(int i =1; i<=year;i++) {
//				money= money*(1+t);
//			}
//		System.out.println(money);
//	}
}
