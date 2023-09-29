package chapter4;

import java.util.Scanner;

public class java247 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        // Tạo một mảng 2 chiều đại diện cho các chỗ ngồi
	        String[][] chonChoNgoi = new String[3][10];
	        // Vòng lặp để lặp lại việc đặt chỗ cho nhiều người
	         // Hiển thị trạng thái hiện tại của các chỗ ngồi
	            System.out.println("Trạng thái chỗ ngồi:");
	            for (int i = 0; i < chonChoNgoi.length; i++) {
	                for (int j = 0; j < chonChoNgoi[i].length; j++) {
	                    if (chonChoNgoi[i][j]==null) {
	                        System.out.print("X ");
	                    } else {
	                        System.out.print("O ");
	                    }
	                }
	                System.out.println();
	            }
	            int luachon=0;
	            do {
	            	System.out.println("nhap lua chon:");
	            	luachon= sc.nextInt( );
	            	if(luachon==1 ) {
	            	// Yêu cầu người dùng nhập vào hàng và cột của chỗ ngồi cần đ
	            	System.out.print("Hàng: ");
		            int hang = sc.nextInt();
		            System.out.print("Cột: ");
		            int cot = sc.nextInt();
		            // Kiểm tra xem chỗ ngồi có khả dụng hay không
		            if (chonChoNgoi[hang][cot]!=null) {
		                System.out.println("Chỗ ngồi đã được đặt, vui lòng chọn chỗ khác.");
		            } else {
		            	sc.nextLine();
		            	System.out.print("nhap ten : ");
				        String name = sc.nextLine();
		                chonChoNgoi[hang][cot] = name;
		                System.out.println("Đặt chỗ thành công!");
		            }
		        System.out.println("Cảm ơn bạn đã sử dụng dịch vụ đặt chỗ của chúng tôi!");
	            	}
	            	if(luachon==2 ) {
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
	            	if(luachon==3 ) {
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
	            }while(luachon!=4 );
	            }
	    }



		



