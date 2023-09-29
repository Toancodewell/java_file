package java436;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> st = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Nhập lua chon: ");
			int luachon=sc.nextInt();
			sc.nextLine();
			if(luachon==1) {
			System.out.print("Nhập name: ");String name = sc.nextLine();
			System.out.print("Nhập khoa: ");String khoa = sc.nextLine();
			System.out.print("Nhập ma: ");int ma = sc.nextInt();
			System.out.print("Nhập diem: ");double diem = sc.nextDouble();
			Student hs = new Student(name,khoa,ma,diem);
			st.add(hs);}
			else if (luachon==2 ) {
				for(Student a : st)
					System.out.println(a);
			}
			else if (luachon==3) {
				System.out.print("Nhập name: ");String name = sc.nextLine();
				for(Student a : st)
					if(a.getName(). equals(name))// index 
					System.out.println(a);
			}
		
		}

	}

}
