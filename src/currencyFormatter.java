import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.text.NumberFormatter;

public class currencyFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 70;
		NumberFormat num = NumberFormat.getCurrencyInstance();
		num.format(x);
		
		System.out.println(num.format(x));
		
		Locale india = new Locale("en", "IN");
		
		NumberFormat numSwedish = NumberFormat.getCurrencyInstance(india);
		String y = numSwedish.format(x);
	System.out.println(y);

	}

}
