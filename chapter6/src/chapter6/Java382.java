package chapter6;
import java.util.Random;
public class Java382 {
	
	public static void main(String[] args) {
//	String a = "hgth";
//	System.out.println(a=="hgth");
//	String b = new String(a );
//	System.out.println(a.equals(b));
//		for(int i =0 ; i<10 ;i++ ) {
//			System.out.print((int)(Math.random()*255+1) + " ");
//		}
		Random rd = new Random( );
		for(int i =0 ; i<10 ;i++ ) {
		System.out.print(rd.nextInt(256)+ " ");
		}
	}

}
