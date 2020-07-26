package by.htp.onedimensionalarrays.logic;

/* Задана последовательность N вещественных чисел. Вычислить сумму чисел, 
  порядковые номера которых являются простыми числами.
     A sequence of N real numbers is given. Calculate the sum of numbers whose 
     ordinal numbers are prime numbers.*/

   public class Task12 {
	
	public static int sumPrimeValues(int []x) {       //находим простые числа и суммируем их значения
		
	   int sum = 0;
		
		for (int n = 2; n < x.length; n++) { 
			
		     boolean isPrime=true;
			
		           for (int i = 2; i < n; i++) {
		 
		               if ((n % i) == 0) {
				       
                                   isPrime = false;     
                                     }
                                       }
                                         if (isPrime) sum = x[n] + sum;
                                           }
		                             return sum;
                                               }
	                          public static void main(String [] args) {
		
		        int [] N = {27, 3, 64, 8, 27, 5, 82, 80, 6, 28, 6, 29, 58, 7, 28, 7, 6, 20, 9, 78, 52, 89, 5, 7, 2, 75, 3, 46, 7, 7, 5, 44, 56, 77};
		        
		System.out.print(" Суммa чисел, массива N, \n" + 
	 " порядковые номера, которых являются простыми числами = " + sumPrimeValues(N));
       }	
    }

  //суммa чисел, массива N, 
  //порядковые номера, которых являются простыми числами = 349
