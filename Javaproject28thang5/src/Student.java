
public class Student {
	private String sno;
	private String name;
	private String addr;
	private String cell;
	public String dept;
	public int grade;
	public char sex;
	private int[] scores;
	private double avg;
	
	public Student() {
	}
	public void setAddrCell(String addr , String cell) {
		this.addr=addr ;
		this.cell=cell;
	}
	public void setDeptGrade(String dept , int grade) {
		this.dept=dept;
		this.grade=grade;
	}
	public Student(String sno, String name, String addr, String cell, String dept, int grade, char sex, int[] scores) {
		this.sno = sno;
		this.name = name;
		this.addr = addr;
		this.cell = cell;
		this.dept = dept;
		this.grade = grade;
		this.sex = sex;
		this.scores = scores;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	public double getAvg(int[] a ) {
		double sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		return sum/3;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
