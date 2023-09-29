package chapter4;

import java.util.Scanner;

public class java246bai11 {
	private int a ,b;
	

	public java246bai11() {

	}
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int tinh(char k) {
		int m=0;
		switch (k) {
	    case  '*':
	        m = this.a*this.b;
	        break;
		case  '/':
	        m= a/b ;
	        break;
	    default:
	        System.out.println("nhap sai!");
	}
		return m;
		
	}

 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in );
		System.out.println("nhap a  : ");
		int a = sc. nextInt();
		
		System.out.println("nhap b : ");
		int b = sc. nextInt();
		
		System.out.println("nhap k : ");
		char k = sc.next().charAt(0);
		
		java246bai11 ba = new java246bai11();
		ba.setValue( a, b);
		System.out.println( ba.tinh(k));
		

	}

}
