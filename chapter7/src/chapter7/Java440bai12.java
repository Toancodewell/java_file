package chapter7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Random;

public class Java440bai12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in );
		HashMap<String, String> op = new HashMap<String, String>();
		op.put("eye","mat");
		op.put("jealous","ghen ti");
		op.put("fail","loi");
		op.put("money","tien");
		op.put("impact","anh huong");
		op.put("prior","truoc khi");
		op.put("consiquence","persuade");
		op.put("convince","hau qua");
		op.put("love","yeu");
		System.out.println("tro choi kiem tra tu>>>>");
		int luachon=0;
		do {
			System.out.println("단어 테스트:1 , 단어 삽입:2 , 졸료:3>>>>");
			luachon=sc.nextInt();
			if(luachon==2) {
				String a =" ";
				do {
				System.out.println(" nhap dung de ket thuc: ");
				System.out.print("nhap tu: ");
				a = sc.next();
				System.out.print("nhap nghia: ");
				String b = sc.next();
				op.put(a , b);
				}while(!a.equals("dung"));
				}
			if(luachon==1) {
				System.out.println("Now"+op.size()+"words"+"text -1 to stop:");
//				Set<String> keySet = op.keySet();
//	            Iterator<String> it=  keySet.iterator();
//                Random random = new Random();
//                Object [] countryArray = keySet.toArray();
//                String[] valuesArray = op.values().toArray(new String[op.size()]);
//                int index = 0;
////                for (String value : valuesArray ) {
////                	valuesArray[index] = value;
////                	index++;
////    	        }
//                int randomIndex = random.nextInt(countryArray.length);
//                String correctCountry = (String) countryArray[randomIndex];
//                String correctCapital = op.get(correctCountry);
//				int ran = random.nextInt(valuesArray.length);
//				String ranvalue = (String) countryArray[ran];
//				 int correctIndex = random.nextInt(4);
//				int[] orderNumbers = new int[4] ;
//				 String[] displayValues = new String[4];
//			     int valueIndex = 0;
//	    	        for (int i = 0; i < 4; i++) {
//	    	            if (i != ran) {
//	    	            	displayValues [i] = valuesArray[valueIndex];
//	    	                valueIndex++;
//	    	            }
//	    	            orderNumbers[i] = i + 1;
//	    	        }
//               while(true) {
//            	   System.out.println(correctCountry);
//            	   for(int i=0;i<4;i++ ) {
//            		   System.out.print(orderNumbers[i] + ". " + displayValues[i]);
//            	   }
//            	   System.out.print(">>> ");
//            	   int k = sc.nextInt();
//            	   boolean isCorrect = k == (correctIndex + 1);
//       	        	System.out.println("Đúng? " + isCorrect);
//				 
//			}}
				while(true) {
			    Object[] keysArray = op.keySet().toArray();
		        Random random = new Random();
		        int randomIndex = random.nextInt(keysArray.length);
		        String randomKey = (String) keysArray[randomIndex];

		        String correctValue = op.get(randomKey);
		        String[] valuesArray = op.values().toArray(new String[op.size()]);

		        int halfSize = valuesArray.length / 2;
		        String[] displayValues = new String[halfSize];
		        int[] orderNumbers = new int[halfSize];

		        int correctIndex = random.nextInt(halfSize);
		        displayValues[correctIndex] = correctValue;

		        int valueIndex = 0;
		        for (int i = 0; i < halfSize; i++) {
		            if (i != correctIndex) {
		                displayValues[i] = valuesArray[valueIndex];
		                valueIndex++;
		            }
		            orderNumbers[i] = i + 1;
		        }

		        System.out.println("Giá trị key ngẫu nhiên: " + randomKey);
		        System.out.println("Các giá trị value:");

		        for (int i = 0; i < halfSize; i++) {
		            System.out.print(orderNumbers[i] + ". " + displayValues[i]);
		        }
		       
		        System.out.print(">>>>");
		        Scanner scanner = new Scanner(System.in);
		        int userInput = scanner.nextInt();
		        if(userInput==-1 ) break;

		        boolean isCorrect = userInput == (correctIndex + 1);
		        System.out.println("Đúng? " + isCorrect);
		        }}
			
		}while(luachon!=3);

	}

	}
