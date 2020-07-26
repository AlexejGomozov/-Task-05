package by.htp.onedimensionalarrays.logic;

/* Дан одномерный массив A[N]. Найти:
max(a2,a4,...,a2k )+min(a1,a3,...,a2k+1)
  You are given a one-dimensional array A [N]. To find:
  max (a2, a4, ..., a2k) + min (a1, a3, ..., a2k + 1) */

    public class Task15 {

	 public static int maxEven(int[] x) {   //находим максимум четных ячеек массива
		
	     int max = x[0];
		
		  for(int i = 0; i< x.length; i++) {
			
			if(i%2 == 0 & max < x[i]) max = x[i];
		          }		
		            return max;
	                      }
                               public static int minOdd(int[] x) {    //находим минимум нечетных ячеек массива
		
	                         int min = x[0];
	
	                            for(int i = 0; i< x.length; i++) {
		
		                       if(i%2 != 0 & min > x[i]) min = x[i];
	                                 }	
		                          return min;
	                                   }
	
	                                  public static void main(String[]args) {
		
		                     int [] s = {7, 28, 6, 8, 25, 2, 90, 76, 78, 3, 65, 28, 65, 87, 98};
		
		              int sum = maxEven(s) + minOdd(s);
		
		        System.out.print("maxEven("+ maxEven(s)+ ") + " + " minOdd(" + minOdd(s)+ ") = "+ sum);
	             }
                 }
   //maxEven(98) +  minOdd(2) = 100
