package java437;

import java.util.HashMap;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		HashMap<String, Location > lc = new HashMap<String, Location>();
		Location lc1[]=new Location[3];
        Scanner sc = new Scanner(System.in);
        int i =0;
        String name="";
        while(i <3) {
        System.out.print("name and Address: ");
        String n = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
//        Location lc1=new Location(n,a,b);
        lc1[i]=new Location(n,a,b);
        lc.put(n, lc1[i]);
        i++;
      }
        while(true) {
        	 System.out.print("name find: ");
        	 name = sc.next();
        	if(name.equals("dung")) {
        		break;
        	}
        	Location lc2 = lc.get(name);
        	if(lc2==null) {
        		System.out.println("no name !");
        	}else {
//        		System.out.println(lc2.getA()+" ,"+lc2.getB() + lc2.getName() );
        		System.out.println(lc2.toString() );
        	}
        	        }
	}

}
