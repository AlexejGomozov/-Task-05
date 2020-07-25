package by.htp.onedimensionalarrays.logic;

/*  Дана последовательность действительных чисел а1 а2 ,..., аn . 
    Выяснить, будет ли она возрастающей. 
       Given a sequence of real numbers a1 a2, ..., an.
        Find out if it will be increasing.*/

         public class Task04 {

	        public static boolean increasOrNot( int []x) {
		
		       boolean increasOr = false;
		
		         for (int i = 1; i< x.length; i++) {
			
			       if(x[i-1]< x[i]) increasOr = true;
			
			         else increasOr = false;
		              }
		               return  increasOr; 
	                    }
		
	                   public static void main(String[]args) {
		
		            int [] increasingNumb = {1, 2, 3, 4, 5, 6, 7, 8, 0};
		
		         System.out.print( increasOrNot(increasingNumb));
	           }
             }
