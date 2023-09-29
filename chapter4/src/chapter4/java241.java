package chapter4;
import java.util.Scanner;
public class java241 {
	private int m,s,e;
	
	

	public java241(int m, int s, int e) {
		this.m = m;
		this.s = s;
		this.e = e;
	}
	public int avar(int m,int s,int e ) {
		return (m+s+e)/3;
		
	}


	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in );
		System.out.println("nhap: ");
		int m = sc.nextInt();
		int s  = sc.nextInt();
		int e = sc.nextInt();
		java241 b = new java241(m,s,e);
		System.out.println("trung binh: "+b.avar(m, s, e));
		sc.close();

	}

}
