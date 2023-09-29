package java439bai11;
import java.util.Vector;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
import java.util.Random;
import java.util.Map;
import java.util.Set;
public class Test439 {

	public static void main(String[] args) {
		Vector<nation> nations = new Vector<>();
		  	nations.add(new nation("대한민국", "서울"));
	        nations.add(new nation("미국", "워싱턴 D.C."));
	        nations.add(new nation("영국", "런던"));
	        nations.add(new nation("일본", "도쿄"));
	        HashMap<String, String> h = new HashMap<String, String>();
	        for (nation n : nations) {
	            h.put(n.getCountry(),n.getCapital());
	        }
	        Scanner sc = new Scanner(System.in );
	        int luachon=0;
	        do {
	        	System.out.print("nhap luac chon: ");
	        	luachon=sc.nextInt();
	        	if(luachon==1 ){
	        		String name="";
	        		do {

	        		System.out.print("nhap ten: ");
	        		name = sc.next();
//	        		if(name.equals("dung")) {
//	        			break ;
//	        			}
	        		sc.nextLine();
	        		System.out.print("nhap thu do: ");
	        		String dia = sc.next();
	        		if(h.get(name)!=null)
	        			System.out.println("da co");
	        		else 
	        			h.put(name, dia);
	        		}while(!name.equals("dung"));}
	        	else if(luachon==2 ) {
	        		
	                Set<String> keySet = h.keySet();
	                Iterator<String> it=  keySet.iterator();

//	                Random random = new Random();
//	                Object[] countryArray = keySet.toArray();
//	                int randomIndex = random.nextInt(countryArray.length);
//	                String correctCountry = (String) countryArray[randomIndex];
//	                String correctCapital = h.get(correctCountry);
//	                System.out.println(correctCountry);
//	                System.out.println(countryArray.length);
	               
	                	while(true) {
	                		 while(it.hasNext()) {
	     	                	String name = it.next();
	     	                	String score = h.get(name);
	                		System.out.println(name+"can tim:");
	                		String a = sc.next();
	                		if(a.equals("dung")) break;
	                		if(a.equals(h.get(name))) {
	                			System.out.print(name+"dung");
	                		}else {
	                			System.out.print("sai");
	                		}
	                	}
	                	
	                }
	        		
	        	}
	        	
	        	
	        }while(luachon!=3);
	       
	        
	}

}
