package by.htp.onedimensionalarrays.logic;

/* Дана последовательность чисел а1 ,а2 ,..., an. Указать наименьшую длину числовой оси, 
   содержащую все эти числа. 
     A sequence of numbers a1, a2, ..., an is given. Specify the smallest length of a numeric 
     axis that contains all of these numbers.*/

     public class Task06 {

	 public static int  axisLength (int []x) {
		
	      int min = x[0];
		
	         int max = x[0];
	
	            for (int i = 0; i< x.length; i++) {
		
	        	if (x[i] < min) min = x[i];
		
	        	  if (x[i] > max) max = x[i];
		
	                     }		
		             return  max - min;
	                       }	
	
	                         public static void main (String [] args) {
		
		                    int [] m = {13, 87, 9, 89, 17, 87, 56, 79, 82, 73, 41, 71, 15}; 		
		
		                       System.out.print("The smallest length of a numeric axis is: " + axisLength(m));
	                                }
                                          }

                                           //The smallest length of a numeric axis is: 80
