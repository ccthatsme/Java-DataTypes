import java.util.Arrays;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
       // System.out.println(A.substring(3, 4));
        
        
        char[] one = A.toCharArray();
        char[] compare =new char [A.length()];
        
        int c = 0;
        int correct = 0;
        
        String x = null;
        String y = null;
        int e = A.length();
        int d = A.length()-1;
        //so it will start at one end and compare the substring at the first index to the last index
        //it will keep a running total of the correct matches and if it matches the length
        //we will print yes
        for(int i = 0; i <= A.length()-1; i++) {
//        	System.out.println(A.substring(i, i+1));
//        	System.out.println(A.substring(d, e));
        	if(A.substring(i, i+1).compareTo(A.substring(d, e)) == 0){
        		correct++;
        		e--;
            	d--;
        	}
        	else {
        	e--;
        	d--;
        	}
        }
        if(correct == A.length()) {
        	System.out.println("yes");
        }
        else {
        	System.out.println("no");
        }
      
        
        
        
        
        
        
        
        
//        for(int i = one.length-1; i == 0; i--) {
//        	char a = one[i];
//        	char b = one[c];
//        	int diff = a - b;
//        	
//        	if(Character.compare(a, b) != 0) {
//        		
//        		c++;
//        	}
//        	else {
//        		correct++;
//  
//        		c++;
//        	}
//        	
//        }
//        if (correct == one.length) {
//        	System.out.println("yes");
//        }
//        else {
//        	System.out.println("no");
//        	System.out.println(one.length);
//        	System.out.println(correct);
//        }
    
        
//       for (int x = 0; x < compare.length; x ++) {
//    	   if (compare[x] == one[(compare.length-1)-x]) {
//    		   correct++;
//    		
//    	   }
//    	   else {
//    		   correct = correct;
//    	   }
//       }
//       
//       if(correct == one.length) {
//    	   System.out.println("yes");
//       }
//       else {
//    	   System.out.println("no");
//       }
//        
//	}

}
}
