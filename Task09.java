package by.htp.onedimensionalarrays.logic;
import java.util.Arrays;
/* Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший
  элементы.
  You are given real numbers a1, a2, ..., an. Swap the largest and smallest items. */

   public class Task09 {

	  public static int[]order (int[]x){
		
		  boolean g = false;
		
		    int bg = 0;
		
		       while(!g) {
			
		       	 g = true;
			
			       for(int i = 1; i < x.length; i++) {
				
				      if(x[i-1] > x[i]) {
					
					     g = false;
					
					       bg = x[i-1];
					
					          x[i-1] = x[i];
					
					             x[i] = bg;
				                 }
			                       }
		                             }
		
		                               return x;
	                                     }
	
	                                public static void main(String[]args) {
		
		                 int [] v = {7, 65, 62, 37, 23, 82, 87, 52, 62, 89, 52, 0, 93, 52};
		
		       System.out.print(Arrays.toString(order(v)));
		
	        }
       }
