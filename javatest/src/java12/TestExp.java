package java12;

import java.util.Scanner;
public class TestExp {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("몇 개의 지수 객체를 생성?");
			int expNums = sc.nextInt();
			MyExp mx[] = new MyExp[expNums];
			for(int i=0;i<mx.length;i++) {
				mx[i]=new MyExp();
			}
			for(int i=0;i<expNums;i++) {
				System.out.print("밑술를 입력하세요=>");
				double base = sc.nextDouble();
				System.out.print("지수를 입력하세요=>");
				int exp = sc.nextInt();
				mx[i].setBase(base);
				mx[i].setExp(exp);
			}
			System.out.println("출력분입니다.");
			for(int i=0;i<mx.length;i++) {
				mx[i].getValue(mx[i].getBase(), mx[i].getExp());
				mx[i].printExp();
			}
			double sum = 0;
			for(int i=0;i<mx.length;i++) {
				sum+=mx[i].getValue(mx[i].getBase(), mx[i].getExp());
			}
			System.out.println();
			System.out.println("sum = "+ sum);
		

	}

}
