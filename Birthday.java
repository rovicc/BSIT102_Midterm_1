import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;


public class Birthday {
	public static void main (String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd-M-yyyy");
		
		System.out.println("Input Date: ");
		String input_date = sc.nextLine();
		date = format.parse(input_date);
		System.out.println(date);
		
		Calendar calendar = new GregorianCalendar();
		
		String input_bdate = "5-6-2001 ";
		Date bdate = format.parse(input_bdate);
	    System.out.println("Birthday: " + input_bdate);
	    
	    
		int year = calendar.get(Calendar.YEAR);
		calendar.setTime(bdate);
		int byear = calendar.get(Calendar.YEAR);
		
		int age = year - byear;
		System.out.println("My age: " + age);
		
		
	}
}
