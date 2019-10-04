import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String a = "mmoya";
		String b = "mommy";
		String c1 = "ommmy";
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		 char[] A = a.toCharArray();
		 char[] B = b.toCharArray();
		 char[] C = c1.toCharArray();
		 //testing the sorting method for arrays
		 //so from here just compare the two strings and if same you know they are anagram
		 Arrays.sort(A);
		 Arrays.sort(B);
		 Arrays.sort(C);
		 System.out.println(A == B);
		 System.out.println(B==C);
		 System.out.println(C);
		 boolean finalCheck = true;
		 int letterMatch = 0;
		 
		 for(int i = 0; i < B.length; i++) {
			 if(B[i] == C[i]) {
				 letterMatch++;
				 
			 }
		 
		 }
		 if (letterMatch == A.length) {
			 System.out.println("they match");
		 }
		 else {
			 System.out.println("no match");
		 }
			 
		 
//		 int i = 0;
//		 int c = i +1;
//		 c++;
//		 System.out.println(c);
		 
		 
//		 
//		 for(int i = 0; i <= A.length-1; i++ ) {
//			 int letterCheck = 0;
//			 for (int c = 0; c <= A.length-1; c++) {
//				 if(A[i] == A[c]) {
//					 letterCheck++;
//					 System.out.println(letterCheck);
//				 }
//				 else {
//					 System.out.println("non");
//				 }
			
////				 while(letterCheck>0) {
////					 System.out.println("yes");
////					 break;
//				 }
			 }
			 
		 
}

	//this was the correct method I turned in on hackerrank
	
	 static boolean isAnagram(String a, String b) {
	        a = a.toLowerCase();
	        b = b.toLowerCase();
	        char[] A = a.toCharArray();
	         char[] B = b.toCharArray();
	         java.util.Arrays.sort(A);
	         java.util.Arrays.sort(B);
	         int letterMatch = 0;
	         boolean check = true;
	          for(int i = 0; i < B.length; i++) {
	              if(A.length == B.length){
	             if(B[i] == A[i]) {
	                 letterMatch++;
	                 
	             }
	              }
	              else{
	                  break;
	              }
	         
	         }
	         if (letterMatch == B.length) {
	             check = true;
	         }
	         else if (letterMatch != B.length) {
	             check = false;
	         }
	         return check;

	    }



