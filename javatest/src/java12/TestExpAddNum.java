package java12;
import java.util.Scanner;
public class TestExpAddNum {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double base,num;
			int exp;
			System.out.print("밑술를 입력하세요=>");
			base = sc.nextDouble();
			System.out.print("지수를 입력하세요=>");
			exp = sc.nextInt();
			System.out.print("실수를 입력하세요=>");
			num = sc.nextDouble();
			ExpAddNum myexp = new ExpAddNum(base, exp, num);
			System.out.println();
			
			System.out.print("밑술를 입력하세요=>");
			base = sc.nextDouble();
			System.out.print("지수를 입력하세요=>");
			exp = sc.nextInt();
			System.out.print("실수를 입력하세요=>");
			num = sc.nextDouble();
			ExpAddNum ean = new ExpAddNum(base, exp, num);
			
			System.out.println();
			myexp.printExp();
			ean.printExp();
			
			double sum=myexp.getValue(myexp.getNum())+
					ean.getValue(ean.getNum());
			System.out.println();
			System.out.println("두 수의 합은 "+ sum );
		}

	}



