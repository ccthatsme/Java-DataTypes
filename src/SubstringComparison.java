import java.util.ArrayList;
import java.util.Collections;

//Return the respective lexicographically smallest and largest 
//substrings as a single newline-separated string.
//first line is word, second line is the size of the groupings
//welcome 
//3
//3 letter groupings of welcome. 

//this code below worked by inputing into an arraylist, sorting the arraylist and return
//the first and last entry of it
public class SubstringComparison {

	public static void main(String[] args) {
		String s = "welcometojava";
		char[] arr = s.toCharArray();
		int k = 3;
		
		System.out.println(arr[0]);
		System.out.println(s);
		System.out.println(s.substring(0, 3));
		
		System.out.println(getSmallestAndLargest(s, k));

	}
	

	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest = s.substring(0, k);
	        String largest = "";
	        String sub = "";
	        char[] arr = s.toCharArray();
	        ArrayList<String> list = new ArrayList<>();
	        
	        for (int i = 0; i <= s.length()-(k); i=i+1){
	        	sub = s.substring(i, i+k);
	        	list.add(sub);
	        
	        }
	        
	        Collections.sort(list);
	        smallest = list.get(0);
	        largest = list.get(list.size()-1);
	        
	        
	       
	        

	        
//	       for (int i = 0; i < s.length()-(k+1); i=i+1){
//	    	   if (s.substring(i, i+k).compareTo(smallest) < 0) {
//	    		   smallest = s.substring(i, i+k);
//	    	   }
//	    	   else if(s.substring(i, i+k).compareTo(largest) > 0) {
//	    		   largest = s.substring(i, i+k);
//	    	   }
//	       }
//	        
	        return smallest + "\n" + largest + list;
	    }

}
