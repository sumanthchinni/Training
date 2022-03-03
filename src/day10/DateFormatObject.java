package day10;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt=new Date();
		formatDate(dt,"yyyy.MM.dd G 'at' HH:mm:ss z");
		
		formatDate(dt,"EEE, MMM d, ''yy");
		
		formatDate(dt,"EEEE, MMMM dd, yyyy");
		
		formatDate(dt,"hh 'o''clock' a,zzzz");
		
		formatDate(dt,"HH:mm:ss:SSS a");
		formatDate(dt,"yyyy.MM.dd 'T' HH:mm:ss.SSSZ");
	}
	public static void formatDate(Date dt,String pattern) {
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String formatedDate=sdf.format(dt);
		System.out.println("Formated date ---- "+formatedDate+"\n Pattern ------"+pattern);
	}

}
