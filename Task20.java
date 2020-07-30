package by.htp.onedimensionalarrays.logic;
import java.util.Arrays;

/* Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый 
 * второй элемент (освободившиеся элементы заполнить нулями).
 *  Примечание. Дополнительный массив не использовать. 
      An integer array is given with the number of elements n. Compress the array, throwing out
      every second element from it (fill the freed elements with zeros). Note. Do not use
      an additional array. */

       public class Task20 {

	  public static int []removeZeros(int[] k){
		
	     for(int i = 1; i< k.length; i=i+2) {
			
	        k[i] = 0;
			
		  }
		
		    return  k;
	              }
		
	              public static void main(String[] args) {
		
		int [] x = {76, 8, 76, 2, 83, 4, 75, 2, 50, 18, 57, 38, 66, 78, 37, 48, 5, 20};
		
         System.out.print(Arrays.toString(removeZeros(x)));		
       }
      }
//[76, 0, 76, 0, 83, 0, 75, 0, 50, 0, 57, 0, 66, 0, 37, 0, 5, 0]
