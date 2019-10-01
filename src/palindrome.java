import java.util.Arrays;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        char[] one = A.toCharArray();
        char[] compare =new char [A.length()];
        
        int c = 0;
        for(int i = one.length-1; i <= 0; i--) {
        	
        	compare[c] = one[i];
        	c = c +1;
        }
        int correct = 0;
        
       for (int x = 0; x < compare.length; x ++) {
    	   if (compare[x] == one[(compare.length-1)-x]) {
    		   correct++;
    		
    	   }
    	   else {
    		   correct = correct;
    	   }
       }
       
       if(correct == one.length) {
    	   System.out.println("yes");
       }
       else {
    	   System.out.println("no");
       }
        
	}

}
