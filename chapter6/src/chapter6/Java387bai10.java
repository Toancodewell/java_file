package chapter6;

import java.util.Scanner;

public class Java387bai10 {

	public static void main(String[] args) {
		int k[ ]= {1,2,3};
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so: ") ; 
		int n = sc.nextInt();
		String mang[]=new String[n];
		sc.nextLine();
		 System.out.println(">>2:"+mang.length ) ; 
		for(int i=1 ;i<mang.length;i++ ) {
			System.out.print(i+">>:") ; 
			mang[i] = sc.nextLine();
//			System.out.print(">>2: ");
//			String name2 = sc.nextLine();
		 }
		 while(true ) {
			 if(sc.nextLine()!=null) {
			 System.out.println(">>1:"+mang[1]) ; 
			 int m1 =(int) (Math.random()*k.length+1);
			 int m2 =(int) (Math.random()*k.length+1);
			 int m3 =(int) (Math.random()*k.length+1);
			 if(m1==m3 && m1 ==m2) {
				 System.out.print(m1+" "+m2+" "+m3) ; 
				 System.out.print("thang !") ; 
				 break;
			 }
			 else {
				 System.out.print(m1+" "+m2+" "+m3) ; 
				 System.out.print("thua! ") ; 
			 }}
			 if(sc.nextLine()!=null) {
			 System.out.println(">>2:"+mang[2]) ; 
			 int m4 =(int) (Math.random()*k.length+1);
			 int m5 =(int) (Math.random()*k.length+1);
			 int m6 =(int) (Math.random()*k.length+1);
			 if(m4==m5 && m4 ==m6) {
				 System.out.print(m4 +" "+m5+" "+m6) ; 
				 System.out.print("thang !") ; 
				 break;
			 }
			 else {
				 System.out.print(m4+" "+m5+" "+m6) ; 
				 System.out.print("thua! ") ; 
			 }}
		 }
		 sc.close(); 
	}

}
