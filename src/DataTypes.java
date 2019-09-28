import java.util.ArrayList;
import java.util.Scanner;
public class DataTypes {

	public static void main(String[] args) {
		long x;
		

		ArrayList<Long> list = new ArrayList<>();

		        Scanner sc = new Scanner(System.in);
		        int t=sc.nextInt();

		        for(int i=0;i<t;i++)
		        {
		        	 x=sc.nextLong();
		        	list.add(x);
		        }

		      
		      
		            
		            	for (int c = 0; c < list.size(); c++) {
		            		
		            	
		                
		                
		                
		                System.out.println(list.get(c)+" can be fitted in:");
		                if(list.get(c)>=-128 && list.get(c)<=127){
		                    System.out.println("* byte");
		                    System.out.println("* short");
		                    System.out.println("* int");
		                    System.out.println("* long");
		                    
		                    }
		                else if(list.get(c)>=-32768 && list.get(c)<=32767 ) {
		                    System.out.println("* short");
		                    System.out.println("* int");
		                    System.out.println("* long");
		                }
		           
		                 else if(list.get(c)>=-2147483648 && list.get(c)<=2147483647) {
		                    System.out.println("* int");
		                    System.out.println("* long");
		                }
		                //for some reason this does not work
		                else if(list.get(c)>=-(Math.pow(2, 63)) && list.get(c)<=(Math.pow(2, 63))-1) {
		                    
		            
		                    System.out.println("* long");
		                }
		                else{
		                    System.out.println(list.get(c) + "can't be fitted anywhere");
		                }
		            }
		           

		        }
		    }
		





	


