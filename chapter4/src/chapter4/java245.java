package chapter4;

import java.util.Scanner;

public class java245 {
	private String name,tel;
	

	public java245(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	

	public String getName() {
		return name;
	}


	public String getTel() {
		return tel;
	}
	public void xuat() {
		System.out.println(getTel());
	}


	public static void main(String[] args) {
//		java245 b = new java245("toan","toan");
//		double s[]=new double[3];
		Scanner sc = new Scanner(System.in );
		System.out.println("nhap so : ");
		int n = sc.nextInt();
		java245 c[ ]= new java245[n];
		for(int i=0;i<c.length;i++ ) {
			sc.nextLine();
			System.out.println("nhap ten : ");
			String name = sc. nextLine();
			System.out.println("nhap tel : ");
			String tel = sc. nextLine();
			c[i]= new java245(name,tel);
		}
		System.out.println("nhap xog ");
		String k ;
		do {
			System.out.println("nhap ten tim : ");
			k=sc.nextLine();
			boolean d = true;
			for(int i=0;i<c.length;i++ ) {
				if(k. equals(c[i].getName())) {
					c[i].xuat();
					d=false;
					break;
					
				}
			}
			if(d) {
				System.out.println("khong co!");
			}
			
		}while(!k.equals("dung"));
	}

}
