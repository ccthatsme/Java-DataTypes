import java.util.Scanner;

public class StringsIntro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int sum = B.length() + A.length();
        System.out.println(sum);
        
        char a = A.charAt(0);
        int x = a;
        char b = B.charAt(0);
        int y = b;
        
        if (x > y) {
        	System.out.println("yes");
        }
        else if (x <= y) {
        	System.out.println("no");
        }
        
//        if (a > b) {
//        	System.out.println("yes");
//        }
//        else if (a < b) {
//        	System.out.println("no");
//        }
        
       // char[] arr = A.toCharArray();
        
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1) );
       
        

	}

}
