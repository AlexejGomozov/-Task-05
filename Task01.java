package by.htp.onedimensionalarrays.logic;
//import java.util.Arrays.*;
/* В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
 *  которые кратны данному К. */
public class Task01 {
	
	/*public static int divAmo(int []x, int k) {
		 k = 2;
		int sum = 0;
		for( int i: x) {
			if (x[i]% k == 0) sum = sum + x[i];
			
		}
		return sum;
	}
	*/
	
	public static void main(String[] args) {          //public static void task() {
	int K = 2;
	int sum = 0;
	int [] A = {1, 10, 55, 39, 97, 345, 98, 0, 57, 9};     //для нахождения значения ячеек массива можно использовать Scanner or random 
	for( int i=0; i < A.length; i++) {
		if (A[i]% K == 0) {sum = sum + A[i];}
		//else continue;
		
	
	//System.out.print( divAmo(A, K));
}
	System.out.print( sum);
	}
}