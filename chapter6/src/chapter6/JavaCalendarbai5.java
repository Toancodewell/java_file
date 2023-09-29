package chapter6;
import java.util.Calendar;
import java.util.Date;
public class JavaCalendarbai5 {
	public static void main(String[ ]args ) {
	Date currentDate = new Date();
    System.out.println(currentDate);
	Calendar date = Calendar.getInstance();
	int ampm = date.get(Calendar.AM_PM);
	if(ampm== Calendar.AM) {
		System.out.println("good morning");
	}
	else if(ampm== Calendar.PM) {
		System.out.println("good apternoon");
	}
	else {
		System.out.println("good night");
	}
		
}}
