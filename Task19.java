package by.htp.onedimensionalarrays.logic;
import java.util.Arrays;
/* В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
   Если таких чисел несколько, то определить наименьшее из них.
    Find the most frequent number in an array of integers with n elements. If there are several 
    such numbers, then determine the smallest of them */

     public class Task19 {

	  public static int[] counterRepeat(int [] y) {                                        // составляем массив считающий сколько раз повторялись цифры
		
              int count = 0;
				
	           int [] povtor = new int [y.length] ;
		
                        for (int i = 0; i < y.length; i ++) {
			
		      	     for( int j = i +1 ; j < y.length; j ++) {
				
				  if(y[i] == y[j])  povtor[i]  ++;          // 
	 		
	                            }			     
                                      }                                                                                  
                                       return  povtor;
	                               }
	
	                               public static int  counterMassiv (int [] w) {                  //счетчикл, для будущего массива
		 
		                   int count = 0;
		
		                 for ( int i = 0; i < w.length; i ++) {
			
		              if( w[i] == 1) count ++;                                               //1.   считаем числа которые повторяются 1 раз
		             }
			
	                 return  count ;
	               }
	
	               public static int [] nowMassiv (int [] v) {
		
		          int [] povtorNumb = new int [counterMassiv(v)];
		
		             int j = 0;
		
                                for ( int i = 0; i < v.length; i ++) {
			
			             if( v[i]== 1) {                                                       //1.   отбираем в массив числа которые повторяются 1 раз
				
				          if  (j == counterMassiv(v)) break;  povtorNumb[j] = i; j++;
				             }
			                       }
	
		                               return  povtorNumb;
	                                         }
	
	                                       public static int [] elementPovtor (int [] x, int [] y) {        // повторяющиеся элементы массива
		
	                                   int [] element = new int [y.length];
		 	                                                          	 
	                              for( int i = 0; i< x.length; i ++) {
			
		                 for( int j = 0; j< y.length; j ++) {
						
			      if(y[j] == i)  element[j] = x[i];
		              }
			
		              }
			
		              return  element;
	                      }      
	                      public static int minFromArray(int []h) {                                      //считаем минимальное число из повтрояющихся
	                                	   
	                          int min = h[0];
	                                	   
	                             for (int i = 0; i<h.length; i++) {
	                                		   
	                                if(h[i] < min) min = h[i];
	                                  }
	                                	  	                                	   
	                                    return min;
	                                      }
	                                   
	                                    public static void main(String[]args) {
		
		                        int p [] = {5, 6, 9, 8, 7, 4, 8, 7, 9, 4, 1, 2, 2, 4, 9, 8, 4, 9, 8, 2, 3, 4, 8, 1, 5};
				         		
		                   System.out.print("Количество повторов элемента массива");  System.out.println(Arrays.toString(counterRepeat(p))); 
		             
		              System.out.print("Ячейки повторяющих элементов массива 1 раз");    System.out.println(Arrays.toString(nowMassiv(counterRepeat(p)))); 
		              
		          System.out.print("Элементы, которые повторяются в массиве ");   System.out.println(Arrays.toString(elementPovtor(p, nowMassiv(counterRepeat(p)))));
		             
		      System.out.print("Наименьший из повторяющихся элементов ");    System.out.println(minFromArray(elementPovtor(p, nowMassiv(counterRepeat(p)))));
	           }
               }
//Количество повторов элемента массива[1, 0, 3, 4, 1, 4, 3, 0, 2, 3, 1, 2, 1, 2, 1, 2, 1, 0, 1, 0, 0, 0, 0, 0, 0]
//Ячейки повторяющих элементов массива 1 раз[0, 4, 10, 12, 14, 16, 18]
//Элементы, которые повторяются в массиве [5, 7, 1, 2, 9, 4, 8]
//Наименьший из повторяющихся элементов 1
