package by.htp.onedimensionalarrays.logic;
import java.util.Arrays;
/* Дана последовательность целых чисел a1,a2,..,an . Образовать новую последовательность, 
   выбросив из исходной те члены, которые равны min(a1,a2,...,an). */

public class Task17 {
	
public static int findMinimum (int [] x) {
		
		int min = x[0];
		
		for (int i = 1; i < x.length; i++) {
			
			min = Math.min(min, x[i]);
		}
		
		return min;
	}
	
public static int quantityWithoutMinimum (int [] x) {

	int count = 0;
	
	for (int i = 0; i < x.length; i++) {
		
		if(x[i] == findMinimum(x)) count ++;
	}
	
	return x.length - count;
}

	public static int [] sequenceWithoutMinimum (int [] x) {
		
		int [] sequence = new int [quantityWithoutMinimum(x)];
		
		int j = 0;
		
		for (int i = 0; i < x.length; i++) {
			
			if(x[i] != findMinimum(x)) {
				
				if (j == quantityWithoutMinimum(x)) break; sequence[j] = x[i]; j++;
				}
		}
		
		return sequence;
	}
	
	public static void main(String[] args) {
		
		int [] y = {4, 7, 4, 8, 90, 78, 50, 4, 34, 87, 20, 81};
		
		System.out.print(Arrays.toString(sequenceWithoutMinimum(y)));
	}

}
        //[7, 8, 90, 78, 50, 34, 87, 20, 81]