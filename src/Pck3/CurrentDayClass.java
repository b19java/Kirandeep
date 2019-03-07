package Pck3;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;

public class CurrentDayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar c=Calendar.getInstance(TimeZone.getDefault());
Date date=c.getTime();
int  dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
String s=""+dayOfWeek;
String s1=String.valueOf(dayOfWeek);
System.out.println("Current Date is: " + date);
System.out.println("Current Day of Week is: " + dayOfWeek);
}

}
