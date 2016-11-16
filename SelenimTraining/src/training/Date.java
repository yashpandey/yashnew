package training;

import java.text.SimpleDateFormat;

public class Date {
	
	
	public static void main (String [] args){
	 Date dNow = new Date( );
     SimpleDateFormat ft = new SimpleDateFormat ("dd");

     System.out.print("Current Date: " + ft.format(dNow));
	
	
//	SimpleDateFormat sdf = new SimpleDateFormat("dd");
//	Calendar c = Calendar.getInstance();
//	c.setTime(new Date()); // Now use today date.
//	String output = sdf.format(c.getTime());
//	System.out.println(output);
	}
}
