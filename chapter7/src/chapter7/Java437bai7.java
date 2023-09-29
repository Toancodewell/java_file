package chapter7;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Java437bai7 {
public static void main(String[] args) {
		 HashMap<String, Double> hs = new HashMap<String, Double>();
	     Scanner sc = new Scanner(System.in);
	     System.out.println("name and marks ex;korea 4.5");
	        String name = "";
	        int i=0;
	        double diem=0;
	        while (i<4) {
	            System.out.print("name and marks: ");
	            name = sc.next();
//	            if (name.equals("dung")) {
//	                break;
//	            }
	            sc.nextLine();
	            diem = sc.nextDouble();
	            hs.put(name, diem);
	            i++;
	        }
	        System.out.print("name and marks standard: ");
	        double tc = sc.nextDouble();
	        Set<String> keys = hs. keySet();
	        Iterator<String> it = keys.iterator();
	        while(it.hasNext()) {
	        	String key = it.next();
	        	double sc1 = hs.get( key);
	        	if(sc1>tc) {
	        		System.out.println(key);
	        		System.out.println(sc1);
	        	}
	        }
	        
	        
	}

}
