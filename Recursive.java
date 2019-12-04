
import java.util.Scanner;



public class Recursive {
    
	
	        
	         
	       
	         
			
			 public static int mToTheNth(int m, int n) {
			        if (n != 0)
			            return (m * mToTheNth(m, n - 1));
			        else
			            return 1;
			    }
			
		    public static void main(String[] args) {
		    	 Scanner numbers = new Scanner(System.in);
		    	  
		    	 System.out.println("please enter a base number");
		    	 
			     int m = numbers.nextInt();
			     
			     System.out.println("please enter a power");
			         
		    	 int n = numbers.nextInt();
		    	

		       
		        int answer = mToTheNth(m, n);
		        
		        System.out.printf("%d^%d = %d", m, n, result);
		        
		        
		        
		    }
		   
		
		
}


	


