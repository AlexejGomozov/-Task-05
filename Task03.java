package by.htp.onedimensionalarrays.logic;

/* Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше
  - положительное или отрицательное. 
     Given a sequence of integers a1 a2, ..., an. Find out which number occurs first - positive or 
     negative.*/

    public class Task03 {
	
	    public static String determine (int []x) {
		
		   String sign = "" ; 	if(x[0]  > 0 ) sign ="Раньше встречается положительное число";
		
		       else sign = "Раньше встречается отрицательное число";
		
		 	      return  sign ;
	                        }
		
	                      public static void main(String [] args) {
		
		     int [] numbers = {1, 3,-3, 0, 3, -2, -1};     // с пустым массивом все ячейки определяются как "0" , а это как отрицательное значение
		
		 System.out.print(determine(numbers));
	 }
 }
