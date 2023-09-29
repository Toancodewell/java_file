package chapter7;

import java.util.Scanner;
import java.util.Vector;

public class Java435bai4 {

	public static void main(String[] args) {
		Vector<Integer> vc = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		while(true ) {
			System.out.print("Nhập luong mua: ");
			int a = sc.nextInt();
			if(a==0 ) {
				System.out.print("dung!");
				break;
			}
			vc.add(a);
			int sum =0;
			for(int i=0;i<vc.size();i++ ) {
				sum += vc.get(i);
//				sum+=k;
			}
			int b = sum/vc.size();
			System.out.println("trung binh:"+b);
		}
			sc.close();
	}

}
