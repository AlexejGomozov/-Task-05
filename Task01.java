package by.htp.onedimensionalarrays.logic;  
/* В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 The array A [N] contains natural numbers. Find the sum of those elements that are multiples of a given K. */
   public class Task01 {
	
      public static void main(String[] args) {         
	int K = 2;
	  int sum = 0;
	     int [] A = {1, 10, 55, 39, 97, 345, 98, 0, 57, 9};     //для нахождения значения ячеек массива можно использовать Scanner or random 
	       for( int i=0; i < A.length; i++) {
		 if (A[i]% K == 0) {sum = sum + A[i];}			
	           }
	            System.out.print( sum);
	              }
                        }
                         //108
