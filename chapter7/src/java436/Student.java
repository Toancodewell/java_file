package java436;

public class Student {
	private String name,khoa;
	private int ma;
	private double diem;
//	public Student() {
//		super();
//	}
	public Student(String name, String khoa, int ma, double diem) {
		this.name = name;
		this.khoa = khoa;
		this.ma = ma;
		this.diem = diem;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", khoa=" + khoa + ", ma=" + ma + ", diem=" + diem + "]";
	}
	
	
}
