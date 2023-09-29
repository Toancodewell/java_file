package chapter6;
//import java.util.StringTokenizer;
import java.util.Date;
public class Java380 {
	    public static void main(String[] args) {
	        Date currentDate = new Date();
	        System.out.println(currentDate);
	    	
	    	java.util.StringTokenizer st = new java.util.StringTokenizer("a=3,b=5,c=6","=,");
	    	System.out.println(st.countTokens());
	    	while(st.hasMoreElements()) {
	    		System.out.println(st.nextToken());
	    		
	    	}
	    	int sum=0;
	    	while (st.hasMoreTokens()) {
	            String token = st.nextToken();
	            try {
	                int number = Integer.parseInt(token);
	                sum += number;
	            } catch (NumberFormatException e) {
	                // Không làm gì nếu token không phải là số
	            }
	          
	        }
	    	  System.out.println("Tổng các số trong chuỗi là: " + sum);
	        
	    }
	    	
	    }
	


