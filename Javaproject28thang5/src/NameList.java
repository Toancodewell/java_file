import java.util.Scanner;

public class NameList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jumsu[ ] = null;
		System.out.print("Nhập so hoc sinh: ");
		int number = sc.nextInt();
		Student students[] = new Student[number];
		for(int i=0;i<students.length;i++ ) {
			students[i]=new Student();
		}
		for(int i=0;i<students.length;i++ ) {
			System.out.printf ("#### %d 학생 입력 #### ",i+1);
			System.out.println();
			System.out.print("학번: ");
			String sno =sc.next();
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("주소: ");
			String addr = sc.next();
			System.out.print("연략처: ");
			String cell = sc.next();
			System.out.print("학과: ");
			String dept  = sc.next();
			System.out.print("학년: ");
			int grade = sc.nextInt();
			System.out.print("성별: ");
			char sex = sc.next().charAt(0);
			students[i].setSno(sno);
			students[i].setName(name);
			students[i]. setAddrCell(addr, cell);
			students[i]. setDeptGrade(dept, grade);
			students[i]. setSex(sex);
			jumsu = new int[3 ];
			double avg=0;
			System.out.printf ("#### %d 점수 입력 #### ",i+1);
			System.out.println();
			for(int j=0;j<jumsu.length;j++ ) {
				jumsu[j]=sc.nextInt();
//				avg+=jumsu[j];
			}
			students[i].setScores(jumsu);
			// tao them 1 private avg
//			double sum = avg/3;
			students[i].setAvg(avg/3);//sum
			
			
		}
		System.out.println("********학적 테이블 ********");
		System.out.println("학번\t\t 이름\t 주소\t\t 연락처\t\t 학과\t 학년\t\t 성별\t JAVA\t DB\t OS\t 평균\n ");
		for(int i=0;i<students.length;i++ ) {
			System.out.print(students[i].getSno()+"\t\t"+students[i].getName()+"\t"
					+students[i].getAddr()+"\t\t"
					+students[i]. getCell()+"\t\t"
					+students[i].getDept()+"\t\t"
					+students[i].getGrade()+"\t\t"
					+students[i]. getSex()+"\t"
					);
			for(int j=0;j<3;j++ ) {
				System.out.print(students[i].getScores()[j]+"\t");
			}
//			System.out.printf("%.3f",students[i].getAvg(students[i].getScores()));
			System.out.printf("%.3f",students[i].getAvg());
			System.out.println();
			
		}
	}                
}
