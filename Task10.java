package by.htp.onedimensionalarrays.logic;
import java.util.Arrays;

/* Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i. */

public class Task10 {

	public static int cellСounter(int[]x){      //счетчик ячеек для массива
		
		int count = 0;
		
		for(int i = 0; i< x.length; i++) {
			
			if(x[i] > i) count++;
		}
		
		return count;
	}
	
  public static int[]higherOrderNumbers(int[] x) {
			
	int [] printNeededNumbers = new int [cellСounter(x)];
	
	int j = 0;
	
		for(int i = 0; i< x.length; i++) {
			
			if(x[i] > i)  {
				
				if(j == cellСounter(x)) break;   //если, при этом цикле, номер ячейки нового массива станет равным 
				                                  // счетчику ячеек для массива, то прекращаем цикл
				printNeededNumbers[j] = x[i];  j++;
			}
		}
		
		return printNeededNumbers;
}
	
	public static void main(String[]args) {
		
		int [] c = {0, 1, 2, 3, 7, 9, 0, 8, 7, 8, 6, 56, 55, 11, 23};
		
		System.out.print(Arrays.toString(higherOrderNumbers(c)));
	}
}
