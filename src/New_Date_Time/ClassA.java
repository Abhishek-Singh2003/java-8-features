package New_Date_Time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ClassA 
{
void meth1()
{
	for(String s : ZoneId.getAvailableZoneIds())
		System.out.println(s);
	
	System.out.println("==> "+ZoneId.getAvailableZoneIds().size());
}
public static void main(String[] args)
{
	System.out.println(LocalDate.now()+"\n");
	System.out.println(LocalTime.now()+"\n");
	System.out.println(ZonedDateTime.now()+"\n");
	System.out.println(LocalTime.now(ZoneId.of("Europe/London"))+"\n");
	
	// Most Imp date Time format.
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:a");
	String ampm = LocalTime.now().format(dtf);
	System.out.println("==> "+ampm);
//	 new ClassA().meth1();
}
}
