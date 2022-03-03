package day10;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class DateObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		
		Calendar c=Calendar.getInstance();
		System.out.println(c.getTime());
		
		GregorianCalendar gc=new GregorianCalendar(2022,2,25,11,20,45);
		System.out.println(gc.getTime());
		System.out.println("YEAR: " + gc.get(Calendar.YEAR));
		System.out.println("MONTH: " + gc.get(Calendar.MONTH));
		System.out.println("DAY_OF_YEAR: " + gc.get(Calendar.DAY_OF_YEAR));
		System.out.println("HOUR_OF_DAY: " + gc.get(Calendar.HOUR_OF_DAY));
		
		GregorianCalendar gc1=new GregorianCalendar(2022,6,25,06,45,20);
		System.out.println(gc1.getTime());
		if(gc.get(Calendar.YEAR)==gc1.get(Calendar.YEAR)) {
			System.out.println("years are equal");
		}
		else {
			System.out.println("Years are not equal");
		}
		
	}

}
