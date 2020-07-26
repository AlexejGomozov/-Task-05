package by.htp.onedimensionalarrays.logic;

/*Определить количество элементов последовательности натуральных чисел, 
  кратных числу М и заключенных в промежутке от L до N.
   Determine the number of elements of a sequence of natural numbers that
   are multiples of M and enclosed in the interval from L to N. */

     public class Task13 {

	public static int amountElements (int [] x, int a, int b, int c) {  //число "a" - на которое нужно делить
		                                                                // "b" и "c" - номера ячеек между которыми проверяется кратность
	  int count = 0;
		
	    for(int i=b; i < c; i++) {
			
	      if(x[i]%a == 0) count++;	
		}	
		 return  count;
	          }
	
	                                               public static void main(String[] args) {
		
		                              int [] A = {27, 63, 48, 2, 8, 62, 38, 7, 56, 71, 23, 72, 86, 75, 64};
		
		                        int M = 2;
		
		                  int L = 2;
		
		           int N = 13;
		
		    System.out.print("Количество элементов последовательности натуральных чисел,\n"
	      + " кратных числу "+ M + " и заключенных в промежутке массива А от "+ L+" до "+ N +", = " + amountElements(A, M, L, N));
	  }
       }
//Количество элементов последовательности натуральных чисел,
//кратных числу 2 и заключенных в промежутке массива А от 2 до 13, = 8
