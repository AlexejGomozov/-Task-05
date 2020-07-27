package by.htp.onedimensionalarrays.logic;
import java.util.Arrays;

/* Дана последовательность действительных чисел a1,a2,...,an .
   Указать те ее элементы, которые принадлежат отрезку [с, d]. */

public class Task14 {

public static  int counter (int []x, int v, int c) {   //счетчик ячеек для будущего массива
	                                                   //дан массив и точки между которыми нужно считать элементы
	          int count = 0;                                 
		
		for(int i = v; i<= c; i ++ ) count ++;
		
		
		return count;
	}
	
	public static  int[] numInSegment (int []y, int b, int n) {
		
		int [] numbers = new int [counter(y, b, n)];
		
		int i = 0;
		
		for (int j = b; j <= n; j ++) { 
			
			numbers[i] = y[j]; i ++;			
		}	
		
		return numbers;
		
	}
	
	public static void main(String[] args) {
		int a = 2;
		
		int b = 15;
		
		int [] d = {85, 15, 62, 87, 36, 45, 17, 51, 97, 51, 98, 75, 17, 65, 19, 75, 91, 8, 75};
		 
		System.out.print(Arrays.toString(numInSegment(d, a, b)));
		
	}
}
   //[62, 87, 36, 45, 17, 51, 97, 51, 98, 75, 17, 65, 19, 75]