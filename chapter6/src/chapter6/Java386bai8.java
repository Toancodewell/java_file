package chapter6;

import java.util.Scanner;

public class Java386bai8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print(">>");
		 String  a=sc.nextLine();
		 int i=1;
		 while(sc.nextLine()!=null ) {
			 String b=a.substring(i);
			 String c=a.substring(0, i);
			 i++;
			 System.out.print(b+c);
			 
			 
		 }

	}

}
