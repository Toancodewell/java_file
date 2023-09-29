package chapter6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Java386bai7 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String a ="";
		 boolean b = true;
		 while(b) {
			 System.out.print(">>");
			 a=sc.nextLine();
			 if (a.equals("dung")) {
	                System.out.println("Đã dừng");
	                break;
	            }
			 StringTokenizer st = new StringTokenizer(a," ");
			 System.out.println("so: "+st. countTokens());
		 }
	}

//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        String input = "";
//	        while (true) {
//	            System.out.print("Nhập giá trị (hoặc dừng để kết thúc): ");
//	            input = scanner.nextLine();
//	            if (input.equals("dung")) {
//	                System.out.println("Đã dừng");
//	                break;
//	            }
//	            System.out.println("Bạn đã nhập: " + input);
//	        }
//	    }
//	

}


