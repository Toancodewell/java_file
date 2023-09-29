package chapter6;

import java.util.Scanner;

public class Java388bai11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>:") ;
		String a = sc.nextLine();
		StringBuffer sb = new StringBuffer(a);
		String find="";
		do {
		System.out.print("nhap gia tri tim :") ;
		find = sc.nextLine();
//		String replace = sc.nextLine();
		String s[]=find.split(",");
		if(s[0].length()>1) {
		boolean k = true;
		int index = sb.indexOf(s[0]); 
		 if (index != -1) { // 문자열을 찾았다면
	            sb.replace(index, index + s[0].length(),s[1]);
	            k=false;
	        }
		 else {
			 System.out.println("khong tim thay!") ;
		 }
		 if(!k) {
	        System.out.println(sb.toString()); }}
		else {
			System.out.println("nhap sai!") ;
		}
	    
		}while(!find.equals("dung"));
		 System.out.println("ket thuc !") ;
		 sc.close();
	}

}
