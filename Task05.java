package by.htp.onedimensionalarrays.logic;

import java.util.Arrays;

/*  Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел
    этой последовательности.
    Если таких чисел нет, то вывести сообщение об этом факте.
      A sequence of natural numbers a1, a2, ..., an is given. Create an array of even numbers of 
      this sequence. If there are no such numbers, then display a message about this fact */

   public class Task05 {

	  public static int[] sequence (int []x) {
		
	     int count = 0;                                                                                //счетчик 
		
	        for (int i=0; i< x.length; i++) {
	
		     if (x[i]%2 == 0 & x[i] != 0) {
		        count ++;  System.out.print( x[i] + ", " );}                                        //ищем четные числа и количество ячеек в массиве		
                	}
	        
                           if (count > 0) System.out.println( " - these numbers will be in the array" );     // если нет четных чисел это не печатает 
	
	                     System.out.println(count+ " - amount of even numbers. ");                      // количество чет чисел, если "0" - сообщает об этом
		
	                        int [] evenNumbers = new int [count];
	
	                           if (count == 0)      return  evenNumbers;
	
	                              int j = 0; for (int i=0; i< x.length; i++) {                          //новый массив с четными числами 
		
	                    	         if (x[i] % 2 == 0 & x[i] != 0)  {
	                    	    	   
	                    	           if (j == count) break; evenNumbers[j] = x[i]; j++; 
	                    	            }		
	                                    }				
		                               return  evenNumbers;
	                                        }
		
	                                        public static void main(String [] args) {
		
		                             int [] numbers = {30, 67, 40, 8, 87, 0, 5, 78, 296, 544};
			
		                         System.out.print(Arrays.toString(sequence(numbers)));
				
		                     System.out.print(" - sequence of even numbers");
		                    }
                           }
                           //30, 40, 8, 78, 296, 544,  - these numbers will be in the array
                           // 6 - amount of even numbers. 
			   //[30, 40, 8, 78, 296, 544] - sequence of even numbers     
