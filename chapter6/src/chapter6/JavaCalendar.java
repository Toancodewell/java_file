package chapter6;
import java.util.Calendar;
public class JavaCalendar {
	
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.clear();
		date.set(Calendar.YEAR, 2020);
		date.set(Calendar. MONTH,Calendar.DECEMBER );
		date.set(Calendar.DATE,25 );
//		int m = date.get(Calendar.MONTH)+1;
		System.out.println(date.get(Calendar.YEAR));
//		System.out.println(m);
		System.out.println(date.get(Calendar.MONTH)+1 );

	
//		
		        Calendar cal = Calendar.getInstance();

		        // Set ngày, tháng, năm
		        cal.set(Calendar.DATE, 25);
		        cal.set(Calendar.MONTH, Calendar.DECEMBER);
		        cal.set(Calendar.YEAR, 2020);

		        // In ngày, tháng, năm
		        System.out.println("Ngày: " + cal.get(Calendar.DATE));
				System.out.println(cal.get(Calendar.MONTH)+1 );
		        System.out.println("Năm: " + cal.get(Calendar.YEAR));
		    }
		

	}


