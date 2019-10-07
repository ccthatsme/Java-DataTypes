import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex {

	 public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(MyRegex.getPattern()));
	      
	        }
	        
	        
}

	 private static class MyRegex{
		 
		 private static String pattern;
		 
		 MyRegex(){
			 this.pattern = "([0-5]){2,3}.([0-5]){2,3}.([0-5]){2,3}.([0-9]){2,3}";
		 }

		public static String getPattern() {
			return pattern;
		}

		public void setPattern(String pattern) {
			this.pattern = pattern;
		}
		 
		 
		 
	 }
	 
	 
}