import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        
	        //trimming the whitesace around the string??
	        //then splitting according to those characters
	         String[] items = s.trim().split("[ !,?.\\_'@]+");

	         //if the string is nothing or whitespace just printing zero
	    if(s == null || s.equals("") || s.trim().equals("")){
	       System.out.println("0");
	    }
	    // else if(s.length() > (4 * (10^5))){
	    //     return;
	    // }
	    else{
	       System.out.println(items.length);
	    for(String item: items){
	        System.out.println(item);
	    }
	    }

	    scan.close();

	}

}
