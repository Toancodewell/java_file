package chapter7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Java438bai8 {

	public static void main(String[] args) {
		 HashMap<String, Integer> hs = new HashMap<String, Integer>();
	     Scanner sc = new Scanner(System.in);
	     System.out.println("maneger %:");
	     String name = "";
	    
	     while(true) {
	    	  System.out.print("name and %: ");
	          name = sc.next();
	    	 if(name.equals("dung")) {
	    		 break;
	    	 }
	         sc.nextLine();
	            int diem = sc.nextInt();
	            if (hs.containsKey(name)) {
	                int currentScore = hs.get(name);
	                hs.put(name, currentScore + diem);
	            } else {
	                hs.put(name, diem);
	            }
	            Set<String> keys = hs.keySet();
		        Iterator<String> it = keys.iterator();
		        while(it.hasNext()) {
		        	String key = it.next();
		        	int sc1 = hs.get( key);
		        	System.out.print("("+key+": "+sc1+")");
		        	}
		        System.out.println();
	    	
	     }

	}

}
