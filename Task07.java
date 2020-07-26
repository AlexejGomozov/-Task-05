package by.htp.onedimensionalarrays.logic;

import java.util.Arrays;

/* Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
   большие данного Z, этим числом. Подсчитать количество замен.
    A sequence of real numbers a1, a2, ..., an is given. Replace all its members greater 
    than the given Z with this number. Count the number of substitutions. */

    public class Task07 {

	  public static int counter (int [] x, int c) {   //метод для подсчета замен на опред число 
	
	     int count = 0;
	
	       for(int i = 0; i < x.length; i++) {
		
		    if(x[i] > c) count++; 
	              }
		       return  count;
	                }	   	
	
	    public static int [] replaceForSpecificNumber(int [] x, int c) {   // метод - замена чисел
			
		  for(int i = 0; i < x.length; i++) {
		
	                if(x[i] > c)  x[i] = c; 
		          }
		           return x ;
	                      }
	                                    public static void main(String [] args) {
		
		                                 int [] b = {12, 37, 86, 56, 75, 64, 720, 91, 904, 7};
		
		                                       int Z = 20;
		
		                                            System.out.println(counter(b,Z) + " - количество замен. " );
		
		                                                System.out.print(Arrays.toString(replaceForSpecificNumber(b,Z)));
	                                                            }
                                                                       }
                                           //8 - количество замен. 
                                           //[12, 20, 20, 20, 20, 20, 20, 20, 20, 7]
