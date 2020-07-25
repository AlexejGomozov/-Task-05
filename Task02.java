package by.htp.onedimensionalarrays.logic;
import java.util.Arrays;
/* В целочисленной последовательности есть нулевые элементы.
Создать массив из номеров этих элементов.
    There are zero elements in an integer sequence.
    Create an array from the numbers of these elements */

 public class Task02 {
	
     public static int[] opredMassiv(int [] x) {
	 
	  int count = 0;
		
               for ( int i = 0; i< x.length; i++) {
			
	            if (x[i] == 0) {count ++; 
			  
		        System.out.print(i + "" );}    //чтоб видеть какие числа будут в массиве
                           }	
                              System.out.println( " - these numbers will be in the array" );
		               
                                  int [] nul = new int [count];
		
		                       int i;   int j = 0;
		                			          		
				            for (  i = 0; i< x.length; i++) {
										
					        if (x[i] == 0) { 	
					                 
					             if (j == count) break;  nul[j] = i; j++;
					                }						
			                                   }	
		                                            return nul;
	                                                    }
	
                                                            public static void main (String [] args) {
	
	                                              int [] R = {0, 2, 0, 9, 45, 0, 4, 0, 90, 0, 4 };
				
                                	       System.out.print(Arrays.toString(opredMassiv(R)));
                                            }
                                       }
                                       //02579 - these numbers will be in the array
                                      // [0, 2, 5, 7, 9]
