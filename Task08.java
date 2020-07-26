package by.htp.onedimensionalarrays.logic;

/* Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем 
   отрицательных, положительных и нулевых элементов.
    An array of real numbers is given, the dimension of which is N. Calculate how many 
    negative, positive and zero elements it contains.   */

       public class Task08 {

	     static void  countingNegativePositiveZeroElements (int [] x ) { 
		
		  int countPositive = 0;
		
		        int countNegative = 0;
		
		            int countZero = 0;
		
	                       for (int i = 0; i< x.length; i++) {
			
			            if(x[i] > 0 & x[i]!=0)  countPositive ++;
			               if(x[i] < 0) countNegative ++;
			                 if(x[i] == 0) countZero ++;
		                           }
	                          	     System.out.print("countPositive = " + countPositive + "; \n"
	                          	       + "countNegative = " + countNegative + "; \n"
	                          	   	 + "countZero = " + countZero );		
	                                           }
	            public static void main(String[] args){
		
	      int [] numbers = {28, -76, -50, 98, 72, 3, 0, 49, -58, 0, 28, -37, 4, 0, 82, -73, 69, 87, 0, -56, 72, 2};	
	
	countingNegativePositiveZeroElements(numbers);
	}
 }
       //countPositive = 12; 
      //countNegative = 6; 
      //countZero = 4
