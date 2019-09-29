import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JavaIntToString {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		ArrayList<Character> list = new ArrayList<Character>();
		
		//list.add(e);
		list.toString();
		
		int n = 6;
		char c = (char) n;
		
		//System.out.println(c);
		
		int x = 0;
		int y = 21;
		int z = 2017;
		//cal.set(z, x, y);
		//creates a new clanedar
		//Calendar cal3 = new (z, x, y);
		//gregorian calendar days of week start at 1 and first day is Sunday
		Calendar cal2 = new GregorianCalendar(z, x, y);
		//this is gonna get the calendar day of the week in an integer
		int nt = cal2.get(Calendar.DAY_OF_WEEK);
		cal.set(Calendar.DATE, y);
		
		cal.set(Calendar.YEAR, z);
		System.out.println(nt);
		
		
		
		
	

	}

}
