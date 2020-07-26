package by.htp.onedimensionalarrays.logic;
import java.util.Arrays;
/* Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток
   от деления на М равен L (0 < L < М-1).
    Natural numbers a1, a2, ..., an are given. Indicate those of them for which 
    the remainder of division by M is equal to L (0 <L <M-1).*/

 public class Task11 {

    public static int counter (int [] y, int p) {
			
      int count = 0;
		
        for (int i = 0; i < y.length; i ++) {
			
	  if(y[i]/p > 0 & (y[i]/p < (p - 1))) count ++;
	    }
            return count;
	      }
	
	               public static int[] remainderDivision(int [] x, int m) {
		
		          int j = 0;
		
		             int [] remainder = new int [counter(x, m)];
		
		                for (int i = 0; i < x.length; i ++) {
			
			            if(x[i]/m > 0 & (x[i]/m < (m - 1))) {
				
				        if (j == counter(x, m)) break;
				
				           remainder[j] = x[i]; j ++;
			                    }			
		                              }		
		                              return remainder;
	                                        }
	
	                                      public static void main(String[] args) {
		  
		                         int s = 9;
		
		                 int []r = {7, 65, 82, 73, 90, 10, 76, 62, 73, 75, 60};
		
		     System.out.print(Arrays.toString(remainderDivision(r, s)));
		
	      }
      }
            //[65, 10, 62, 60]
