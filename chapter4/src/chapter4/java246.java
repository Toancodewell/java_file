package chapter4;
import java.util.Scanner; 
public class java246 {
	private static String[] a = {"yeu","be","tien"};
	private static String[] b = {"love","baby","money"};
	
//	public static String[] getA() {
//		return a;
//	}
//	public static String[] getB() {
//		return b;
//	}
	public static String c(String word) {
		boolean k = false;
		for(int i=0 ;i<a.length;i++ ) {
			if(word. equals(a[i])) {
				word = b[i];
				k=true;
				break;}
			}
		if(!k) {
			word ="khong co!";
			}
		return word;
		
	}
	public static void main(String[] args) {
		String w;
		Scanner sc = new Scanner(System.in );
		do {
			System.out.println("nhap : ");
			w = sc.nextLine();
			System.out.println(java246.c(w));
			
		}while(!w.equals("dung"));
		
		


	}

}
