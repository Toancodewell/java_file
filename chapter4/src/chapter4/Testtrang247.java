package chapter4;

import java.util.Scanner;

public class Testtrang247 {
	public static void main(String[] args) {
		String chonChoNgoi[][] = new String[3][10];
	    Scanner sc = new Scanner(System.in);
	    int luachon=0;
	    do {
	    	 System.out.println("명품콘서트 에약 시스텀이다.");
	    	 System.out.print("예약:1 , 조회:2 , 취소:3 , 끝:4>>");
	    	 luachon=sc.nextInt();
	    	 if(luachon==1) {
	    		 System.out.print("좌석구분 S(1) , A(2) , B(3) >> ");
	    		 int hang = sc.nextInt();
	    		 if(hang==1 | hang==2 | hang==3) {
	    			 System.out.print("S>>>");
	  	                for (int j = hang-1; j < chonChoNgoi[hang-1].length; j++) {
	  	                    if (chonChoNgoi[hang-1][j]==null) {
	  	                        System.out.print("X ");
	  	                    } else {
	  	                        System.out.print("O ");
	  	                    }
	  	                }
	  	                System.out.println();
	  	              System.out.print("Name:");
	  	              String name = sc.next();
	  	              System.out.print("번호 :");
	  	              int so = sc.nextInt();
	  	            	if(chonChoNgoi[hang-1][so]==null) {
	  	            		chonChoNgoi[hang-1][so]=name;
	  	            			  }
	  	            		  else {
	  	            			  System.out.println("da co nguoi!");}
	  	            }
	  	     }
	    	 else if(luachon==2) {
	    		   for (int i = 0; i < chonChoNgoi.length; i++) {
      	                for (int j = 0; j < chonChoNgoi[i].length; j++) {
      	                    if (chonChoNgoi[i][j]==null) {
      	                        System.out.print("X ");
      	                    } else {
      	                        System.out.print(chonChoNgoi[i][j]);
      	                    }
      	                }
      	                System.out.println();
      	            }
	    	 }
	    	 else if(luachon==3) {
	    		  System.out.print("좌석 S:1 , A:2 , B :3 >>");
	    		  int hang = sc.nextInt();
	    			 if(hang==1 | hang==2 | hang==3) {
		    			 System.out.print("S>>>");
		  	                for (int j = hang-1; j < chonChoNgoi[hang-1].length; j++) {
		  	                    if (chonChoNgoi[hang-1][j]==null) {
		  	                        System.out.print("X ");
		  	                    } else {
		  	                        System.out.print(chonChoNgoi[hang-1][j]);
		  	                    }
		  	                }
		  	                System.out.println();
	    	 }
	    			 sc.nextLine();
	    			 System.out.print("nhap ten : ");
				        String nam = sc.nextLine();
				        boolean timthay=false;
	            		 for (int i = 0; i < chonChoNgoi.length; i++) {
		       	                for (int j = 0; j < chonChoNgoi[i].length; j++) {
		       	                	if(nam.equals(chonChoNgoi[i][j])) {
		       	                	  for (int k = j; k < chonChoNgoi[i].length - 1; k++) {
		       	                        chonChoNgoi[i][k] = chonChoNgoi[i][k + 1];
		       	                    }
		       	                   chonChoNgoi[i][chonChoNgoi[i].length - 1] = null; // Xóa phần tử cuối cùng của mảng
		       	                    	timthay = true;
		       	                	}
		       	                }
		       	        }
	            		    if (!timthay) {
			       	              System.out.print("ko tim thay !");
			       	          }
	            	}
	    			 
	    	 
	    }while(luachon!=4);
	    System.out.println("Trạng thái chỗ ngồi:");
	    
	}
}
