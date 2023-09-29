package chapter6;

import java.util.Scanner;
import java.util.Random;
public class Java387bai9 {

	public static void main(String[] args) {
		int k[ ]= {1,2,3};
		Scanner sc = new Scanner(System.in);
		int luachon=0;
		do {
			 System.out.print(">>");
			 luachon=sc.nextInt();
			 Random r = new Random();
//			 int may = r.nextInt(k.length)+1;
			 int may =(int) (Math.random()*k.length+1);
			 if(luachon==1 ) {
				 if(may==1)
				 System.out.print("hoa!");
				 else if(may ==2)
					 System.out.print("thua!");
				 else
					 System.out.print("thang");
			 }
			 System.out.println(may);
		}while(luachon!=4 );
		sc.close();
	}

}
